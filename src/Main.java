import user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(20);
        user.setGender("Male");
        user.setName("John");
        System.out.printf("저는 %d살 %s입니다. %s이죠.", user.getAge(), user.getName(), user.getGender());
    }
}