package hello.core.singleton;

public class SingletonService {

    // static을 통해 단 하나만 등록된다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {}

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
