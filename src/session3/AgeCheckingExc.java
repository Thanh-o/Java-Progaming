package session3;
//Custom excetion
//Ngoai le do nguoi dung dinh nghia
public class AgeCheckingExc extends Exception {
    //day la phuong thuc do tu dinh nghia
    public AgeCheckingExc(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Loi nhap vao tuoi: " +super.getMessage();
    }
}
