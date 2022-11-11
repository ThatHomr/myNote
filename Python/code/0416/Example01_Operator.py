# Example01_Operator.html

import turtle

turtle.shape('turtle')
turtle.pensize(10)
# 이동할 거리를 입력
dist = int(input('Enter the distance you want to travel >>> '))
angle = 90

# 이동 거리가 200 미만이면 빨강, 
# 200 이상이면 초록으로 선의 색을 설정
color = 'red' if dist < 200 else 'green'

# 선의 색을 설정
turtle.pencolor(color)

turtle.forward(dist)
turtle.left(angle)

turtle.forward(dist)
turtle.left(angle)

turtle.forward(dist)
turtle.left(angle)

turtle.forward(dist)
turtle.left(angle)

# 프로그램을 유지시키기 위해
# 마지막에 input() 함수를 작성
input('Press any key to exit... ')