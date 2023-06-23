# 1====
# from math import *
# a = list(map(int,input("a: ").strip().split()))
# b = list(map(int,input("b: ").strip().split()))
# x_c = float(input("(x, c)= "))
# c = list(map(int,input("c: ").strip().split()))
# a_b = [a[1]*b[2]-a[2]*b[1],
#      a[2]*b[0]-a[0]*b[2],
#      a[0]*b[1]-a[1]*b[0]]
# k = (a_b[0]*c[0]+a_b[1]*c[1]+a_b[2]*c[2])/x_c
# a_b[0] /= k
# a_b[1] /= k
# a_b[2] /= k
# print(f'[{a_b[0]:g}, {a_b[1]:g}, {a_b[2]:g}]')


# 2============
# from math import *
# a = list(map(int,input("a: ").strip().split()))
# b = list(map(int,input("b: ").strip().split()))
# e1 = float(input("|e1|: "))
# e2 = float(input("|e2|: "))
# phi = float(input("/_(e1, e2): "))
# B = [[e1,e2*cos(phi)],
#      [0,e2*sin(phi)]]
# AB = [[B[0][0]*a[0]+B[0][1]*a[1],B[0][0]*b[0]+B[0][1]*b[1]],
#      [B[1][0]*a[0]+B[1][1]*a[1],B[1][0]*b[0]+B[1][1]*b[1]]]
# print(f'{AB[0][0]*AB[0][1]+AB[1][0]*AB[1][1]:g}')


# 3=============
# from math import *
# def prod(a,b):
#     if type(a) is list:
#         return [a[1]*b[2]-a[2]*b[1],
#         a[2]*b[0]-a[0]*b[2],
#         a[0]*b[1]-a[1]*b[0]]
#     else:
#         return [a*b[0], a*b[1], a*b[2]]
# def su(a,b):
#     return [a[0]+b[0], a[1]+b[1], a[2]+b[2]]
# a = list(map(int,input("a: ").strip().split()))
# b = list(map(int,input("b: ").strip().split()))
# R = su(prod(a,su(prod(4,a),prod(3,b))), prod(a, prod(-1,prod(a,b))))
# print(f'[{R[0]:g}, {R[1]:g}, {R[2]:g}]')


# 4 ========

# from math import *
# def prod(a,b):
#     if type(a) is list:
#         return [a[1]*b[2]-a[2]*b[1],
#         a[2]*b[0]-a[0]*b[2],
#         a[0]*b[1]-a[1]*b[0]]
#     else:
#         return [a*b[0], a*b[1], a*b[2]]
# def su(a,b):
#     return [a[0]+b[0], a[1]+b[1], a[2]+b[2]]
# ma = float(input("|a|: "))
# mb = float(input("|b|: "))
# phi = float(3*pi/4)
# a = [ma,0,0]
# b = [mb*cos(phi),mb*sin(phi),0]
# R = prod(su(prod(-3, a), prod(2, b)), su(prod(3, a), prod(-5,b)))
# print(f'{sqrt(R[0]**2+R[1]**2+R[2]**2):g}')




#5 ==== =
from math import *
A = list(map(int,input("A: ").strip().split()))
B = list(map(int,input("B: ").strip().split()))
C = list(map(int,input("C: ").strip().split()))
V = float(input("V: "))
BA = [A[0]-B[0],A[1]-B[1],A[2]-B[2]]
BC = [C[0]-B[0],C[1]-B[1],C[2]-B[2]]
AA1 = [BA[1]*BC[2]-BA[2]*BC[1],
BA[2]*BC[0]-BA[0]*BC[2],
BA[0]*BC[1]-BA[1]*BC[0]]
k = (AA1[0]*AA1[0]+AA1[1]*AA1[1]+AA1[2]*AA1[2])/V
AA1[0] /= k
AA1[1] /= k
AA1[2] /= k
if(AA1[2]<0):
    AA1[0] *= -1
    AA1[1] *= -1
    AA1[2] *= -1
print(f'[{A[0]+AA1[0]:g}, {A[1]+AA1[1]:g}, {A[2]+AA1[2]:g}]')

