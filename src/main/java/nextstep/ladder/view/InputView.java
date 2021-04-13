package nextstep.ladder.view;

import java.util.Scanner;

public class InputView {

  private static final String INPUT_NAMES_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
  private static final String INPUT_RESULTS_MESSAGE = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
  private static final String INPUT_LADDER_HEIGHT = "최대 사다리 높이는 몇 개인가요?";
  private static final String DELIMITER = ",";
  private static final Scanner SCANNER = new Scanner(System.in);
  private  static final String INPUT_START_NAME = "결과를 보고 싶은 사람은?";

  public static String[] getNames() {
    System.out.println(INPUT_NAMES_MESSAGE);
    String namesString = SCANNER.nextLine();
    return namesString.split(DELIMITER);
  }

  public static String[] getResults() {
    System.out.println(INPUT_RESULTS_MESSAGE);
    String namesString = SCANNER.nextLine();
    return namesString.split(DELIMITER);
  }

  public static int getLadderHeight() {
    System.out.println(INPUT_LADDER_HEIGHT);
    return Integer.parseInt(SCANNER.nextLine());
  }

  public static String getStartName() {
    System.out.println(INPUT_START_NAME);
    return SCANNER.nextLine();
  }
}