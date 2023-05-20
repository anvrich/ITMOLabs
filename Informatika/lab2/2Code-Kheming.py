l = input().split()

def kl(ad):
	if int(ad) % 2 == 0:
		ad = 0
	else:
		ad = 1
	return int(ad)

try:
	r1, r2, i1, r3, i2, i3, i4 = int(l[0]), int(l[1]), int(l[2]), int(l[3]), int(l[4]), int(l[5]), int(l[6])
	R1, R2, R3 = 0, 0, 0
	R1 = r1 + i1 + i2 + i4
	R2 = r2 + i1 + i3 + i4
	R3 = r3 + i2 + i3 + i4

	R1 = kl(R1)
	R2 = kl(R2)
	R3 = kl(R3)

	ll = []
	ll.append(R1)
	ll.append(R2)
	for i in range(2, len(l)):
		if i == 3:
			ll.append(R3)
		else:
			ll.append(int(l[i]))
	print()
	print("Правильный:")
	print("1  | 2  | 3  | 4  | 5  | 6  | 7  |")
	print("----------------------------------")
	print("r1 | r2 | i1 | r3 | i2 | i3 | i4 |")
	print("----------------------------------")
	for i in ll:
		print(i, end = "  | ")

	R1er, R2er, R3er = 0, 0, 0
	R1er = i1 + i2 + i4
	R2er = i1 + i3 + i4
	R3er = i2 + i3 + i4

	R1er = kl(R1er)
	R2er = kl(R2er)
	R3er = kl(R3er)

	er = 0

	if R1er != r1:
		er = er + 1
	if R2er != r2:
		er = er + 2
	if R3er != r3:
		er = er + 4
	print()
	print()
	print("С ощибкой:")
	print("1  | 2  | 3  | 4  | 5  | 6  | 7  |")
	print("----------------------------------")
	print("r1 | r2 | i1 | r3 | i2 | i3 | i4 |")
	print("----------------------------------")
	for i in range(len(l)):
		if i == er - 1:
			print(f"er={l[i]}", end = " | ")	
		else:
			print(l[i], end = "  | ")
	print()
	for i in range(len(f"er={l[i]}")):
		print(f"er={l[i]}")		
except:
	 print("error")
