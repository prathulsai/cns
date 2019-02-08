#include <stdio.h>
#include <tchar.h>
void main( )
{
int i;
char str[15]="hello world";
char str1[15],str2[15];
clrscr();
for(i=0;i<strlen(str);i++)
{
	str1[i]=str[i]&127 ;
	printf("%c",str1[i]);
}  printf("\n");
for(i=0;i<strlen(str);i++)
{
	str2[i]=str[i]^127 ;
	printf("%c",str2[i]);
}
 getch();
}



