// a fibonacci function showing most features of the CMM language

#include <stdio.h>

int mx () {
	return 1000;
}

int main() {
	int lo;
	int hi;
	lo = 1;
	hi = lo;
	printf("%d\n", lo);
	while (hi < mx()) {
		printf("%d\n", hi);
		hi = lo + hi;
		lo = hi - lo;
	}
	return 0;
}