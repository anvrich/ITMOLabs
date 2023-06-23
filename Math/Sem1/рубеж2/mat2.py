#2 ===
 # tx = lambda t: t**3+2*t**2
# ty = lambda t: 5+10*t
# t = 3
# xy = [tx(t),ty(t)]
# xydx = [tx(t+0.000001),ty(t+0.000001)]
# k = (xy[1]-xydx[1])/(xy[0]-xydx[0])
# print(f'{xy[1]-(-1/k)*xy[0]:g}')


# 3 ========
from decimal import *
getcontext().prec = 20000
f = lambda x: (6*x**3+7*x**2)/(x**2+8*x+6)
k = f(Decimal(10**20))/Decimal(10**20);
b = f(Decimal(10**10))-k*Decimal(10**10);
print(f'{b:.5g}')