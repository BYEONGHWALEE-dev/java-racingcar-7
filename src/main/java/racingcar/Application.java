package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        String input = Console.readLine();

        // , 제거 후 자동차 이름을 배열로 저장
        String[] carNameArray = input.split(",");

        // 배열로 변환
        List<String> carNameList = Arrays.asList(carNameArray);

        // 시도 횟수
        int tryCount = Integer.parseInt(Console.readLine());

        //실행 결과
        System.out.println("실행결과");


    }
}
