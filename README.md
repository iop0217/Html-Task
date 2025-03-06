계산기 과제

필수 기능 가이드 Lv1
1. 양의 정수(0 포함)를 입력받기
  - scanner 사용 후 double num1 = Double.parseDouble(str1); 로 정수로 변환하여 사용
2. 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
  - swith문으로 사칙연산 실행 및 나눗셈에서 분모가 0이거나 기호를 잘못 입력한 경우 재실행
3. 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
4. 반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기
  - while 안의 if문으로 정수, 사칙연산 기호와 상관없이 "종료"를 입력하면 코드 종료
  - if (str1.equals("종료")) {
    System.out.print("계산기를 종료합니다.");
    break;
    }

필수 기능 가이드 Lv2
1. 사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
  - results.add(result);
    remove();
    return result;
2. Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정
  - Lv1에 있던 swith문을 Calculator 클래스로 옮겨서 연산을 Calculator 클래스가 담당하도록 수정
3. App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
  - private ArrayList<Double> results = new ArrayList<Double>();
4. Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정
  - 저장된 기록이 5개 초과 시 가장 오래된 기록 순으로 삭제
  - public void remove() {
    if (results.size() >= 6) {
    results.remove(0);
      }
    }

추가 기능
1. "초기화" 입력하면 모든 기록이 초기화
  - public void reset() {
    results.clear();
    }
  - else if (str1.equals("초기화")) {
    System.out.println("계산기를 초기화합니다.");
    calculator.reset();
    continue;
    }
2. "기록" 입력하면 저장된 기록 출력
  - public ArrayList<Double> getSave() {
    return results;
    }
  - else if (str1.equals("기록")) {
    System.out.println("저장된 기록: " + calculator.getSave());
    continue;
    }
