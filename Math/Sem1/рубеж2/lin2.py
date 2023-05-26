# 1========
# from math import *
# L1_up = list(map(int,input("L1_up: ").strip().split()))
# L1_down = list(map(int,input("L1_down: ").strip().split()))

# L2_up = list(map(int,input("L2_up: ").strip().split()))
# L2_down = list(map(int,input("L2_down: ").strip().split()))

# a_b = [L1_down[1]*L2_down[2]-L1_down[2]*L2_down[1],
# 	L1_down[2]*L2_down[0]-L1_down[0]*L2_down[2],
# 	L1_down[0]*L2_down[1]-L1_down[1]*L2_down[0]]
# L = 1/sqrt(a_b[0]**2+a_b[1]**2+a_b[2]**2)
# N = [a_b[0]*L, a_b[1]*L, a_b[2]*L,(a_b[0]*(-L2_up[0])+a_b[1]*(-L2_up[1])+a_b[2]*(-L2_up[2]))*L]
# print(abs(N[0]*L1_up[0]+N[1]*L1_up[1]+N[2]*L1_up[2]+N[3]))

# # 2====
# L_up = list(map(int,input("L1_up: ").strip().split()))
# L_down = list(map(int,input("L1_down: ").strip().split()))
# P = list(map(int,input("P: ").strip().split()))

# t = -(P[0]*L_up[0]+P[1]*L_up[1]+P[2]*L_up[2]+P[3])/(P[0]*L_down[0]+P[1]*L_down[1]+P[2]*L_down[2])
# tm = [L_up[0]+L_down[0]*t, L_up[1]+L_down[1]*t, L_up[2]+L_down[2]*t]

# t2 = -(P[0]*L_up[0]+P[1]*L_up[1]+P[2]*L_up[2]+P[3])/(P[0]*P[0]+P[1]*P[1]+P[2]*P[2])
# t2m = [L_up[0]+P[0]*t2,L_up[1]+P[1]*t2,L_up[2]+P[2]*t2]

# print(f'[{-tm[0]:g}, {-tm[1]:g}, {-tm[2]:g}; {t2m[0]-tm[0]:g}, {t2m[1]-tm[1]:g}, {t2m[2]-tm[2]:g}]')


# 3=====
# x2 = int(input('x^2: '))
# xy = int(input('xy: '))
# y2 = int(input('y^2: '))
# x = int(input('x: '))
# y = int(input('y: '))
# #metod 1
# #for _x in range(-10, 10):
# # for _y in range(-10, 10):
# # if (abs(2*x2*_x+xy*_y+x)<0.1):
# # if (abs(2*y2*_y+xy*_x+y)<0.1):
# # print(f'[{_x:g}, {_y:g}]');
# #metod 2
# _x=(-x-xy*y/2/y2)/(2*x2-xy*xy/2/y2)
# _y=(-y-xy*_x)/2/y2
# print(f'[{_x:g}, {_y:g}]');
	



# 4 =====
from math import *
x2 = float(input('x^2: '))
xy = float(input('xy: '))
y2 = float(input('y^2: '))
print(f'{(pi/2-atan((x2-y2)/xy))*90/pi:g}');


