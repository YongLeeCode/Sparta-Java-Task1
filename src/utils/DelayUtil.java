package utils;

public class DelayUtil {
    public void deplay() {
        try {
            Thread.sleep(500); // 0.5초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
