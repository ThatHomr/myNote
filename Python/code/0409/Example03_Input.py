# 평행사변형을 그리는 프로그램을 작성
import turtle

turtle.shape('turtle')

# 두 변과 한 내각을 입력
a = int( input('변 a 의 길이를 입력하세요 >>> ') )
b = int( input('변 b 의 길이를 입력하세요 >>> ') )
angle = int( input('좌하단의 내각을 입력하세요 >>> ') )

turtle.forward(a)
turtle.left(angle)

turtle.forward(b)
turtle.left(180-angle)

turtle.forward(a)
turtle.left(angle)

turtle.forward(b)
turtle.left(180-angle)

