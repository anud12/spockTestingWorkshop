package com.example.demo.model;

public class ContractModel {
    private Long id;
    private String name;
    private Long code;

    public ContractModel() {

    }

    public ContractModel(Long id, String name, Long code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public ContractModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ContractModel setName(String name) {
        this.name = name;
        return this;
    }

    public Long getCode() {
        return code;
    }

    public ContractModel setCode(Long code) {
        this.code = code;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContractModel)) return false;

        ContractModel that = (ContractModel) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getCode() != null ? getCode().equals(that.getCode()) : that.getCode() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getCode() != null ? getCode().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ContractModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
