# File01_string.py

# 자료형(Data Type)
#  정수형(Integer, int)
#  실수형(Floating-point, float)
#  논리형(Boolean, bool)
#  문자열(String, str)
print( type(100) )
print( type(10.0) )
print( type(True) )
print( type('hello') )
print( 100 + 200 )
print( '100' + '200' )

# 기본 자료형들은 다른 타입으로 변환이 가능하다.
#  ex) '100' → 100 / 100 → '100'
# 변환 함수
#   - int(n)    : n 을 정수로 변환한 값을 준다.
#   - float(n)  : n 을 실수로 변환한 값을 준다.
#   - bool(n)   : n 을 논리값으로 변환한 값을 준다.
#   - str(n)    : n 을 문자열로 변환한 값을 준다.
a = 100
b = 200
print( str(a) + str(b) )
# print( str(100) + str(200) )
# print( '100' + '200' )
# print( '100200' )
print( a + b )
# a 와 b 의 타입이 바뀌지는 않는다.
print( int(False) )
# --------------------------------------
# 문자열(String)
#  - 다수의 문자들의 집합
#  - 유니코드 문자를 나타내는 바이트 배열
#  - 문자열은 문자열끼리 더할 수 있다.
#  - 문자열의 각 문자에는 번호(index)가 부여
#       index : 0 부터 시작하여 1씩 증가하는 정수
#             : 음수도 지원하며 마지막 문자가 -1이고
#               이전 문자로 갈 수록 1씩 감소한다.
#  - 인덱스를 지정하는 방법 = 인덱싱(Indexing)
#      문자열[index] : index 에 위치한 문자 = 문자열
#  - 문자열의 일부를 자르는 방법 = 슬라이싱(Slicing)
#       인덱스를 통해서 자를 위치를 지정
#       슬라이싱 방법
#         - 문자열[start:end:step]
#             start : 슬라이싱의 시작 인덱스
#             end   : 슬라이싱의 마지막 인덱스, 이 앞까지만 자른다.
#             step  : 인덱스 증가량
#         - start <= index < end = start + 글자 수
#         - start, end 는 생략이 가능하며
#           start 를 생략하면 처음부터, end 를 생략하면 끝까지를 의미
hello = 'Hello World'
print(hello[6] + hello[0])
print(hello[0 : 5])
print(hello[6 : 11])
print(hello[ : 5])
print(hello[6 : ])
print(hello[ : ])
print(hello[-5 : ])
print(hello[ : -3])









