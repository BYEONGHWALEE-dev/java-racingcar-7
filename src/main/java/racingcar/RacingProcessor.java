package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RacingProcessor {

    // 각 차가 얼마나 갔는지 기록하는 리스트
    ArrayList<Integer> checkList = new ArrayList<>();

    // 가는지 안가는지 정하기
    Boolean goOrNot(int num) {
        return num >= 4;
    }

    // 매회 실행 결과 보여주는 함수
    void showTheResult(List<String> carNameList){

        for(int i = 0 ; i < carNameList.size(); i++){

            String carName = carNameList.get(i);
            String distance = "-".repeat(checkList.get(i));

            System.out.println(carName + " : " + distance);
        }

        //한줄의 공백을 위해
        System.out.println();
    }

    // 우승자 발표!
    void getTheWinner(ArrayList<String> checkList, List<String> carNameList){

        int max = 0;


        for(int i = 0; i  < checkList.size(); i++){

        }
    }

    // 시뮬레이션 함수
    void simulatingRacing(int num, List<String> carNameList){

        // 출발선 지정
        for (int i = 0; i < num; i++) {checkList.add(i,0);}

        // 레이싱 시작
        for(int i = 0; i < num; i++){

            int randomNum = Randoms.pickNumberInRange(0, 9);

            // depth == 2
            if (goOrNot(randomNum)) {
                checkList.set(i, checkList.get(i) + 1);
            }

            showTheResult(carNameList);
        }
    }




}
