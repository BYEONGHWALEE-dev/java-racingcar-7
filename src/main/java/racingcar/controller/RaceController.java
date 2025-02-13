package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class RaceController {

    private  InputView inputView;
    private OutputView outputView;

    public RaceController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    private ArrayList<Car> checkList = new ArrayList<>();

    // getter/setter method

    public ArrayList<Car> getCheckList() {
        return checkList;
    }

    public void setCheckList(ArrayList<Car> checkList) {
        this.checkList = checkList;
    }

    // 가는지 안가는지 정하기
    Boolean goOrNot(int num) {
        return num >= 4;
    }

    // 시뮬레이션 함수
    void run(){

        List<String> carNameList = inputView.getCarNames();
        int roundCount = inputView.getTryCount();

        // 출발선 지정
        for (String s : carNameList) {
            checkList.add(new Car(s));
        }

        // 레이싱 시작
        for(Car tempCar : checkList) {

            int randomNum = Randoms.pickNumberInRange(0, 9);

            // depth == 2
            if (goOrNot(randomNum)) {
                tempCar.move();
            }

            outputView.showTheResult(checkList);
        }
    }
}
