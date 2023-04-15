#include<iostream> 
using namespace std; 
class LocalNum {

static int x;

public: static void SetData(int xx)

x = xx ;

} 
void Display()

cout<< x;

};

int LocalNum ; x = 0

int main()

{

LocalNum::SetData(33); LocalNum:: Display();

return 0;
