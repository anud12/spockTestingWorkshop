package com.example.demo.service;

import com.example.demo.builder.ContractBuilder;
import com.example.demo.validator.SizeValidator;
import com.example.demo.model.ContractModel;
import com.example.demo.model.Size;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

@Service
public class ContractService {

    private final ContractBuilder builder;
    private final SizeValidator sizeValidator;

    public ContractService(final ContractBuilder builder,
                           final SizeValidator sizeValidator) {
        this.builder = Objects.requireNonNull(builder, "builder must not be null");
        this.sizeValidator = Objects.requireNonNull(sizeValidator, "sizeValidator must not be null");
    }

    public List<ContractModel> getContractList(Size size) {

        validate(size);

        ArrayList<ContractModel> returnList = new ArrayList<>();
        if (size.equals(Size.ZERO)) {
            return returnList;
        }
        returnList.add(builder.buildContract());
        if (size.equals(Size.ONE)) {
            return returnList;
        }
        returnList.add(builder.buildContract());
        if (size.equals(Size.TWO)) {
            return returnList;
        }
        returnList.add(builder.buildContract("Tarent"));
        return returnList;
    }

    private void validate(Size size) {
        sizeValidator.validate(size);
    }

    public Function<Object, Object> myFunction() {
        return (Object object) -> {

            System.out.println(object);
            return object;
        };
    }
}
