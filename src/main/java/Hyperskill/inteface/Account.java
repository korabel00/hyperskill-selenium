package Hyperskill.inteface;

interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

// Declare and implement your AccountServiceImpl here
class AccountServiceImpl implements AccountService {

    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts){
        this.accounts = accounts.clone();
    }

    public Account findAccountByOwnerId(long id) {
        for (Account account : accounts) {
            if (account.getOwner().getId() == id) {
                return account;
            }
        }
        return null;
    }

    public long countAccountsWithBalanceGreaterThan(long value) {

        int count = 0;

        for (Account account : accounts) {
            if (account.getBalance() > value) {
                count++;
            }
        }
        return count;
    }
}


class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() { return id; }

    public long getBalance() { return balance; }

    public User getOwner() { return owner; }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}


/**
You are given an interface named AccountService. The interface has two abstract methods:

findAccountByOwnerId(long id) that returns Account found by owner id or null.
countAccountsWithBalanceGreaterThan(long balance) that returns the number of accounts with the balance greater than the passed value.
There are also two other classes: Account (id, balance, owner) and User (id, firstName, lastName). See their implementations in the provided code template.

You need to implement the AccountService interface and its two methods.

- Your implementation should be named AccountServiceImpl. It should have a constructor with one argument — an array of accounts.

- The implementation must keep the array inside.

- The first method should search for an account by owner id in the array, the second one — count the number of accounts that meet the given condition in the array.

Here's an example of an instance:

Account[] accounts = ...
AccountService service = new AccountServiceImpl(accounts);
Note: do not make classes and the interface public.
**/
