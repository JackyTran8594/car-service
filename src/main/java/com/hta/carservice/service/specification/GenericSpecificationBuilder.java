package com.hta.carservice.service.specification;

import static com.hta.carservice.service.criteria.SearchOperation.getDataOption;

import com.hta.carservice.service.criteria.SearchCriteria;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;

public class GenericSpecificationBuilder<T> {

    private final List<SearchCriteria> params;

    private Class<T> clazz;

    public Class<T> getClazz() {
        return clazz;
    }

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }

    public GenericSpecificationBuilder(List<SearchCriteria> params) {
        this.params = params;
    }

    public GenericSpecificationBuilder() {
        this.params = new ArrayList<>();
    }

    public final GenericSpecificationBuilder with(String key, String operation, Object value) {
        params.add(new SearchCriteria(key, operation, value));
        return this;
    }

    public final GenericSpecificationBuilder with(SearchCriteria searchCriteria) {
        params.add(searchCriteria);
        return this;
    }

    public Specification<T> build() {
        if (params.size() == 0) {
            return null;
        }

        Specification<T> result = new GenericSpecification<>(params.get(0), clazz);

        for (int i = 1; i < params.size(); i++) {
            SearchCriteria searchCriteria = params.get(i);

            switch (getDataOption(searchCriteria.getOperation())) {
                case ANY:
                    result = Specification.where(result).or(new GenericSpecification<T>(searchCriteria, clazz));
                    break;
                case ALL:
                    result = Specification.where(result).and(new GenericSpecification<T>(searchCriteria, clazz));
                    break;
            }
        }

        return result;
    }
}
