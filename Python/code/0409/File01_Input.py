# File01_Input.py

# 입력(Input)
#  - 프로그램 외부에서 내부로 데이터 전달
#   ex) 키보드, 마우스, 스캐너, 파일 읽기 등

# 입력하기 위한 함수
#  - input() 함수
#  - 표준 입력 장치(키보드)로부터 입력을 받을 때 사용한다.
#  - input(prompt=None)
#       prompt : 안내 문구/힌트
#  - input() 함수의 결과 값(입력 값)은 무조건 '문자열'이다.
searching = input('검색어를 입력하세요 >>> ')
# searching = 'Python' → 입력된 값을 사용하기 위해 변수에 저장을 해야한다.
print(f'search value : {searching}')
print(f'searching type: {type(searching)}')

# input() 함수에 의한 입력 값은 '문자열'이기 때문에
# 다른 타입과 연산이 불가능하다.
# 따라서 다른 타입과 연산하기 위해서는 다른 타입으로 변환
#  → 변환 함수를 통해서 원하는 타입으로 변환
searching = int(searching)
# searching = int('10000')
# searching = 10000
print(searching + 100)
    









