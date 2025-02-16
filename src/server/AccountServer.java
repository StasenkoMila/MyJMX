package server;

public class AccountServer {
    private int usersLimit;

    public AccountServer(int usersLimit) {
        this.usersLimit = usersLimit;
    }

    public int getUsersLimit(){
        return  usersLimit;
    }

    public void setUsersLimit(int usersLimit) {
        this.usersLimit = usersLimit;
    }
}
