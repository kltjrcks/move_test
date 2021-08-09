//#include<iostream>
//
//inline int SQUARE(int x)
//{
//	return x * x;
//}
//
//
//int main()
//{
//	std::cout << SQUARE(5) << std::endl;
//	std::cout << SQUARE(12) << std::endl;
//
//	/*매크로함수와 inline함수 차이점.. inline함수는 자료형에 의존적임
//	-> int(3.14) * int(3.14) 해서 9 출력된다. '템플릿'을 이용하면 문제해결가능..*/
//	std::cout << SQUARE(3.14) << std::endl;
//
//	return 0;
//
//}