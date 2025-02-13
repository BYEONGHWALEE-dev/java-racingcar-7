package racingcar.view;

import racingcar.model.Car;

import java.util.ArrayList;

public class OutputView {

    // 매회 실행 결과 보여주는 함수
    public void showTheResult(ArrayList<Car> checkList) {

        for (Car tempCar : checkList) {

            String distance = "-".repeat(tempCar.getPosition());

            System.out.println(tempCar.getName() + " : " + distance);
        }

        //한줄의 공백을 위해
        System.out.println();
    }
}
