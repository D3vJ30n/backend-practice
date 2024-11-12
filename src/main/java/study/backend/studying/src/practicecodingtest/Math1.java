package study.backend.studying.src.practicecodingtest;

// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120813?language=java

/*
문제 해결 과정:
1. 문제 분석
  - 정수 n이 주어질 때, n 이하의 홀수가 담긴 배열을 반환
  - 홀수는 오름차순으로 정렬되어야 함
  - 예: n = 10 → [1, 3, 5, 7, 9]
  - 예: n = 15 → [1, 3, 5, 7, 9, 11, 13, 15]

2. 해결 방법 구상
  - n 이하의 홀수 개수 계산 필요
  - 홀수는 2씩 증가하는 패턴
  - 배열에 순차적으로 홀수 저장

3. 의사코드:
  함수 solution(정수 n):
      홀수 개수 계산
      결과 배열 생성
      for i from 0 to 홀수개수-1:
          배열[i] = 2 * i + 1
      배열 반환
*/

public class Math1 {
    public int[] solution(int n) {
        // n 이하의 홀수 개수 계산
        // (n + 1)을 2로 나누어 올림
        // 예: n = 10 → (10 + 1) / 2 = 5개 (1,3,5,7,9)
        // 예: n = 15 → (15 + 1) / 2 = 8개 (1,3,5,7,9,11,13,15)
        int count = (n + 1) / 2;

        // 결과를 저장할 배열 생성
        // 크기는 계산된 홀수의 개수만큼
        int[] answer = new int[count];

        // 배열에 홀수 저장
        // i를 0부터 시작하여 count-1까지 반복
        for (int i = 0; i < count; i++) {
            // i번째 홀수 계산: 2 * i + 1
            // i = 0 → 1
            // i = 1 → 3
            // i = 2 → 5 ...
            answer[i] = i * 2 + 1;
        }

        // 완성된 홀수 배열 반환
        return answer;
    }
}

/*
시간 복잡도 분석:
- 홀수 개수 계산: O(1)
- 배열 생성 및 초기화: O(n/2)
- 전체 시간 복잡도: O(n)

공간 복잡도 분석:
- 결과 배열: O(n/2)
- 전체 공간 복잡도: O(n)

처리 과정 예시:
1. n = 10인 경우
  - count = (10 + 1) / 2 = 5
  - 배열 크기 5로 생성
  - i = 0: answer[0] = 1
  - i = 1: answer[1] = 3
  - i = 2: answer[2] = 5
  - i = 3: answer[3] = 7
  - i = 4: answer[4] = 9
  - 반환: [1, 3, 5, 7, 9]

장점:
1. 단순한 수식으로 홀수 계산
2. 추가적인 조건 검사 없이 직접 홀수 생성
3. 메모리 효율적 사용 (필요한 크기만큼만 배열 생성)
*/