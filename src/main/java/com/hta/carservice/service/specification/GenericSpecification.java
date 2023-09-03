package com.hta.carservice.service.specification;

import com.hta.carservice.service.criteria.SearchCriteria;
import com.hta.carservice.service.criteria.SearchOperation;
import com.hta.carservice.util.DataUtils;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class GenericSpecification<T> implements Specification<T> {

    private final SearchCriteria searchCriteria;

    @Override
    public Specification<T> and(Specification<T> other) {
        return Specification.super.and(other);
    }

    @Override
    public Specification<T> or(Specification<T> other) {
        return Specification.super.or(other);
    }

    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        Object strToSearch = searchCriteria.getValue();
        switch (Objects.requireNonNull(SearchOperation.getSimpleOperation(searchCriteria.getOperation()))) {
            case CONTAINS:
                return criteriaBuilder.like(
                    criteriaBuilder.lower(root.get(searchCriteria.getKey())),
                    "%" + strToSearch.toString().toLowerCase() + "%"
                );
            case DOES_NOT_CONTAIN:
                return criteriaBuilder.notLike(
                    criteriaBuilder.lower(root.get(searchCriteria.getKey())),
                    "%" + strToSearch.toString().toLowerCase() + "%"
                );
            case BEGINS_WITH:
                return criteriaBuilder.like(
                    criteriaBuilder.lower(root.get(searchCriteria.getKey())),
                    strToSearch.toString().toLowerCase() + "%"
                );
            case DOES_NOT_BEGIN_WITH:
                return criteriaBuilder.notLike(
                    criteriaBuilder.lower(root.get(searchCriteria.getKey())),
                    strToSearch.toString().toLowerCase() + "%"
                );
            case ENDS_WITH:
                return criteriaBuilder.like(
                    criteriaBuilder.lower(root.get(searchCriteria.getKey())),
                    "%" + strToSearch.toString().toLowerCase()
                );
            case DOES_NOT_END_WITH:
                return criteriaBuilder.notLike(
                    criteriaBuilder.lower(root.get(searchCriteria.getKey())),
                    "%" + strToSearch.toString().toLowerCase()
                );
            case EQUAL:
                if (strToSearch instanceof String) {
                    return criteriaBuilder.equal(
                        criteriaBuilder.lower(root.<String>get(searchCriteria.getKey())),
                        strToSearch.toString().toLowerCase()
                    );
                } else {
                    return criteriaBuilder.equal(root.<Object>get(searchCriteria.getKey()), strToSearch);
                }
            case NOT_EQUAL:
                if (strToSearch instanceof String) {
                    return criteriaBuilder.notEqual(
                        criteriaBuilder.lower(root.get(searchCriteria.getKey())),
                        strToSearch.toString().toLowerCase()
                    );
                } else {
                    return criteriaBuilder.notEqual(root.<Object>get(searchCriteria.getKey()), strToSearch);
                }
            case NUL:
                return criteriaBuilder.isNull((root.get(searchCriteria.getKey())));
            case NOT_NULL:
                return criteriaBuilder.isNotNull((root.get(searchCriteria.getKey())));
            case GREATER_THAN:
                return criteriaBuilder.greaterThan(
                    criteriaBuilder.lower(root.get(searchCriteria.getKey())),
                    strToSearch.toString().toLowerCase()
                );
            case GREATER_THAN_EQUAL:
                return criteriaBuilder.greaterThanOrEqualTo(
                    root.<String>get(searchCriteria.getKey()),
                    searchCriteria.getValue().toString()
                );
            case LESS_THAN:
                return criteriaBuilder.lessThan(root.<String>get(searchCriteria.getKey()), searchCriteria.getValue().toString());
            case LESS_THAN_EQUAL:
                return criteriaBuilder.lessThanOrEqualTo(root.<String>get(searchCriteria.getKey()), searchCriteria.getValue().toString());
        }
        return null;
    }

    public GenericSpecification(final SearchCriteria searchCriteria, Class<T> clazz) {
        super();
        String dataType = findDataType(searchCriteria.getKey(), clazz);
        List<String> arrayIgnore = Arrays.asList(SearchOperation.IGNORE_OPERATION_SET);
        if (dataType.equals("Integer")) {
            if (!arrayIgnore.contains(searchCriteria.getOperation())) {
                searchCriteria.setValue(DataUtils.convertToDataType(Integer.class, searchCriteria.getValue().toString()));
                searchCriteria.setDataType(Integer.class);
            }
        }
        if (dataType.equals("Long")) {
            if (!arrayIgnore.contains(searchCriteria.getOperation())) {
                searchCriteria.setValue(DataUtils.convertToDataType(Long.class, searchCriteria.getValue().toString()));
                searchCriteria.setDataType(Long.class);
            }
        }
        if (dataType.equals("Double")) {
            if (!arrayIgnore.contains(searchCriteria.getOperation())) {
                searchCriteria.setValue(DataUtils.convertToDataType(Double.class, searchCriteria.getValue().toString()));
                searchCriteria.setDataType(Double.class);
            }
        }
        if (dataType.equals("String")) {
            //            searchCriteria.setValue(DataUtils.convertToDataType(String.class, searchCriteria.getValue().toString()));
        }
        if (dataType.equals("Float")) {
            if (!arrayIgnore.contains(searchCriteria.getOperation())) {
                searchCriteria.setValue(DataUtils.convertToDataType(Float.class, searchCriteria.getValue().toString()));
                searchCriteria.setDataType(Float.class);
            }
        }

        if (dataType.equals("Byte")) {
            if (!arrayIgnore.contains(searchCriteria.getOperation())) {
                searchCriteria.setValue(DataUtils.convertToDataType(Byte.class, searchCriteria.getValue().toString()));
                searchCriteria.setDataType(Byte.class);
            }
        }

        this.searchCriteria = searchCriteria;
    }

    /**
     * find datatype with fieldName
     * @param fieldName
     * @param clazz
     * @return
     */
    public String findDataType(String fieldName, Class<T> clazz) {
        String dataType = null;
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (fieldName.equals(field.getName())) {
                String[] str = field.getType().getTypeName().split(Pattern.quote("."));
                // str[2] = dataType
                dataType = str[2];
                break;
            }
        }
        return dataType;
    }
}
