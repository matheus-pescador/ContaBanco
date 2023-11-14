public class ContaTerminal {
    private Integer accountNumber;
    private String agency;
    private String name;
    private Double balance;

    public ContaTerminal() {
    }

    public ContaTerminal(Integer accountNumber, String agency, String name, Double balance) {
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.name = name;
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
