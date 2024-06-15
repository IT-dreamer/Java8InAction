package lambdasinaction.myChap3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import lambdasinaction.common.BufferedReaderProcessor;

public class ExecuteAround {

  static final String TEST_FILE = "/Users/yufei.a.chen/IdeaProjects/Java8InAction"
      + "/src/main/resources/lambdasinaction/chap3/data.txt";

  public static void main(String[] args) throws IOException {
    String oneLine = processFile(BufferedReader::readLine);
    String twoLine = processFile((BufferedReader br) -> br.readLine() + br.readLine());
    System.out.println(oneLine);
    System.out.println(twoLine);
  }

  public static String processFile(BufferedReaderProcessor p) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(TEST_FILE))) {
      return p.process(br);
    }
  }
}
