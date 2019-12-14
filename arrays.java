zro main()
{
ent dia2[]={65,66,67};
_imp("array de chars %s",dia2);
chr id5[][]=	{
					{'h','o'},
					{'l','a'}
				};
_imp("%c",id5[0][0]);
_imp("%c",id5[0][1]);
_imp("%c",id5[1][0]);
_imp("%c",id5[1][1]);

dec c;
dec d;
c=5*5.3;
d='a'/2.3;
dec a[c][d];
a[c-1][d-2]=c+d;
_imp("me devuelve un decimal 68.67391304347827 %d",a[c-1][d-2]);

dec y2[2][2][3] = {
					{
						{1.0,2.3,3.3},
						{1.6,2.8,3.2}
					},
					{
						{1.6,2.9,3.8},
						{1.7,2108.8,3.0}
					}
				};

_imp("me devuelve 3.2 %d",y2[0][1][2]);
chr letra='A';
chr id4[letra-60.5][('z'^1)-120];
id4[letra-62.5][('z'^1)-121]={'t'};
_imp("me devuelve t %c",id4[letra-62.5][('z'^1)-121]);


ent N='N';
ent id6['o'-100]['s'/('d'/5)][16%3.5];
id6[0][0][0]=N;
_imp("%e",id6[0][0][0]);


chr dia[]="viernes";
_imp("array de chars %s",dia);
_imp("%c",dia[0]);
_imp("%c",dia[1]);
_imp("%c",dia[2]);
_imp("%c",dia[3]);
_imp("%c",dia[4]);
_imp("%c",dia[5]);
_imp("%c",dia[6]);



bul varK[]={false,true,34};
_imp("%b",varK[2]);
bul varH[2][2];
varH[varK[1]][0]=true;
_imp("%b",varH[varK[1]][0]);


ent varAN[2];
varAN = {{1, 3, 0}, {-1, 5, 9}};
ent listaA[] = varAN[1];
_imp("%e",listaA[1]);

dec varAN2[2];
varAN2 = {{1.0, 3.2, 0.5}, {-1.2, 5.3, 9.8}};
dec listaB[] = varAN2[1];
_imp("%d",listaB[1]);

chr varAN3[2];
varAN3 = {{'A','N','D'}, {'R', 'E', 'A'}};
_imp("%s",varAN3[0]);
chr listaC[] = varAN3[1];
_imp("%c",listaC[0]);


}