# Example01_IF.py
import turtle
# 모서리의 수를 3~5 중 하나를 입력을 받아
# 한 변의 길이가 150인 도형을 그리도록 작성

#-----------------------------
turtle.shape('turtle')     # 모양
turtle.bgcolor('#333')    # 배경색
turtle.pencolor('white')  # 선 색
turtle.speed(1)           # 속도
turtle.pensize(10)        # 선 두께
#-----------------------------
# 모서리의 수를 입력
edge = int(input('Enter the number of edge >>> '))
length = 150
# angle = 180 - ((edge - 2) * 180)/edge
angle = 360 / edge

if edge <= 2: # 그릴 수 없는 도형
    print('Shape that cannot be drawn.')
elif edge == 3: # 삼각형
    turtle.forward(length)
    turtle.left(angle)
    turtle.forward(length)
    turtle.left(angle)
    turtle.forward(length)
    turtle.left(angle)
    # pass # 빈 블록으로 둘 수 있다.
elif edge == 4: # 사각형
    turtle.forward(length)
    turtle.left(angle)
    turtle.forward(length)
    turtle.left(angle)
    turtle.forward(length)
    turtle.left(angle)
    turtle.forward(length)
    turtle.left(angle)
    # pass
elif edge == 5: # 오각형
    turtle.forward(length)
    turtle.left(angle)
    turtle.forward(length)
    turtle.left(angle)
    turtle.forward(length)
    turtle.left(angle)
    turtle.forward(length)
    turtle.left(angle)
    turtle.forward(length)
    turtle.left(angle)
    # pass
else :
    print('Shape not implemented.')


input("Press any key to exit...")