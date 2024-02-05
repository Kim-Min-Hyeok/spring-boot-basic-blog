import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll // 테스트 시작하기 전 한 번만 실행 -> static
    static void beforAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach // 테스트 케이스 시작하기 전에 매번 실행 -> non static
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    @AfterAll // 전체 테스트 마치고 종료하기 전에 한 번만 실행 -> static
    static void afterAll() {
        System.out.println("@AfterAll");
    }

    @AfterEach // 각 테스트 케이스를 종료하기 전 매번 실행 -> non static
    public void afterEach() {
        System.out.println("@AfterEach");
    }
}