# Example01_Loop.py
import turtle

# 3 이상의 정수 n 을 입력을 받아서
# 한 변의 길이가 150인 n 각형을 만들자!

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

# n 각형을 edge 의 수만큼 모서리를 가지기 때문에
# n 번 이동을 하면 된다.
if edge >= 3 :
    for i in range(edge) :
        turtle.forward(length)
        turtle.left(angle)
else :
    print('Shape that cannot be drawn.')   
    
input("Press any key to exit...")