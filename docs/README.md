# ⭐로또⭐

## 기능 목록

### 📝outputView
- 발행한 로또 수량 및 번호를 출력
- 당첨 내역 출력
- 수익률을 소수점 둘째 자리에서 반올림하여 출력

### 📝inputView
- 로또 구입 금액을 입력 받는 문구 출력
- 당첨 번호 입력 문구 출력
- 보너스 번호 입력 문구 출력
- 로또 구입 금액 입력
- 당첨 번호 입력
- 보너스 번호 입력

### 📝예외
1️⃣ 로또 금액
- 1000단위가 아닌 경우 예외 처리
- 숫자가 아닌 경우 예외 처리

2️⃣ 당첨 번호
- ,가 없는 경우 예외 처리
- 1~45 사이의 숫자가 아닌 경우 예외 처리
- 숫자가 아닌 경우 예외 처리
- 중복된 번호가 존재 하는 경우 예외 처리
- 6개의 숫자가 아닌 경우 예외 처리

3️⃣ 보너스 번호
- 숫자가 아닌 경우 예외 처리
- 1 ~45가 아닌 경우 예외 처리
- 당첨 번호와 중복된 경우 예외 처리

### 📝기능
- 입력 받은 금액으로 수량을 구하는 기능
- 1 ~ 45 사이의 중복되지 않는 로또를 생성하는 기능
- 로또 번호를 오름차순으로 정렬하는 기능
- 몇개의 번호가 일치하는지 계산하는 기능
- 수익률을 계산하는 기능
