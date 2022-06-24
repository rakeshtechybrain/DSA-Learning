import java.util.Objects;
import java.util.Set;

public class Employee {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }

    public Set<String> getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Set<String> mobileNo) {
        this.mobileNo = mobileNo;
    }


    public Employee(long id, String empName, String empDept, Address address, long empSalary, Set<String> mobileNo) {
        this.id = id;
        this.empName = empName;
        this.empDept = empDept;
        address = address;
        this.empSalary = empSalary;
        this.mobileNo = mobileNo;
    }

    private long id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", Address='" + address + '\'' +
                ", empSalary=" + empSalary +
                ", mobileNo=" + mobileNo +
                '}';
    }

    private String empName;
    private String empDept;
    private Address  address;
    private long empSalary;
    private Set<String> mobileNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && getEmpSalary() == employee.getEmpSalary() && getEmpName().equals(employee.getEmpName()) && getEmpDept().equals(employee.getEmpDept());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmpName(), getEmpDept(), getEmpSalary());
    }




}
