public class Quine {
	public static void main(String[] args) {
		char[] quine = new char[254];
		quine[0] = 'p';
		quine[1] = 'u';
		quine[2] = 'b';
		quine[3] = 'l';
		quine[4] = 'i';
		quine[5] = 'c';
		quine[6] = ' ';
		quine[7] = 'c';
		quine[8] = 'l';
		quine[9] = 'a';
		quine[10] = 's';
		quine[11] = 's';
		quine[12] = ' ';
		quine[13] = 'Q';
		quine[14] = 'u';
		quine[15] = 'i';
		quine[16] = 'n';
		quine[17] = 'e';
		quine[18] = ' ';
		quine[19] = '{';
		quine[20] = 'p';
		quine[21] = 'u';
		quine[22] = 'b';
		quine[23] = 'l';
		quine[24] = 'i';
		quine[25] = 'c';
		quine[26] = ' ';
		quine[27] = 's';
		quine[28] = 't';
		quine[29] = 'a';
		quine[30] = 't';
		quine[31] = 'i';
		quine[32] = 'c';
		quine[33] = ' ';
		quine[34] = 'v';
		quine[35] = 'o';
		quine[36] = 'i';
		quine[37] = 'd';
		quine[38] = ' ';
		quine[39] = 'm';
		quine[40] = 'a';
		quine[41] = 'i';
		quine[42] = 'n';
		quine[43] = '(';
		quine[44] = 'S';
		quine[45] = 't';
		quine[46] = 'r';
		quine[47] = 'i';
		quine[48] = 'n';
		quine[49] = 'g';
		quine[50] = '[';
		quine[51] = ']';
		quine[52] = ' ';
		quine[53] = 'a';
		quine[54] = 'r';
		quine[55] = 'g';
		quine[56] = 's';
		quine[57] = ')';
		quine[58] = '{';
		quine[59] = 'c';
		quine[60] = 'h';
		quine[61] = 'a';
		quine[62] = 'r';
		quine[63] = '[';
		quine[64] = ']';
		quine[65] = ' ';
		quine[66] = 'q';
		quine[67] = 'u';
		quine[68] = 'i';
		quine[69] = 'n';
		quine[70] = 'e';
		quine[71] = ' ';
		quine[72] = '=';
		quine[73] = ' ';
		quine[74] = 'n';
		quine[75] = 'e';
		quine[76] = 'w';
		quine[77] = ' ';
		quine[78] = 'c';
		quine[79] = 'h';
		quine[80] = 'a';
		quine[81] = 'r';
		quine[82] = '[';
		quine[83] = '2';
		quine[84] = '0';
		quine[85] = '0';
		quine[86] = ']';
		quine[87] = ';';
		quine[88] = 'f';
		quine[89] = 'o';
		quine[90] = 'r';
		quine[91] = '(';
		quine[92] = 'i';
		quine[93] = 'n';
		quine[94] = 't';
		quine[95] = ' ';
		quine[96] = 'i';
		quine[97] = '=';
		quine[98] = '0';
		quine[99] = ';';
		quine[100] = 'i';
		quine[101] = '<';
		quine[102] = 'q';
		quine[103] = 'u';
		quine[104] = 'i';
		quine[105] = 'n';
		quine[106] = 'e';
		quine[107] = '.';
		quine[108] = 'l';
		quine[109] = 'e';
		quine[110] = 'n';
		quine[111] = 'g';
		quine[112] = 't';
		quine[113] = 'h';
		quine[114] = ';';
		quine[115] = 'i';
		quine[116] = '+';
		quine[117] = '+';
		quine[118] = ')';
		quine[119] = '{';
		quine[120] = 'i';
		quine[121] = 'f';
		quine[122] = '(';
		quine[123] = 'i';
		quine[124] = '=';
		quine[125] = '=';
		quine[126] = '8';
		quine[127] = '8';
		quine[128] = ')';
		quine[129] = '{';
		quine[130] = 'f';
		quine[131] = 'o';
		quine[132] = 'r';
		quine[133] = '(';
		quine[134] = 'i';
		quine[135] = 'n';
		quine[136] = 't';
		quine[137] = ' ';
		quine[138] = 'j';
		quine[139] = '=';
		quine[140] = '0';
		quine[141] = ';';
		quine[142] = 'j';
		quine[143] = '<';
		quine[144] = 'q';
		quine[145] = 'u';
		quine[146] = 'i';
		quine[147] = 'n';
		quine[148] = 'e';
		quine[149] = '.';
		quine[150] = 'l';
		quine[151] = 'e';
		quine[152] = 'n';
		quine[153] = 'g';
		quine[154] = 't';
		quine[155] = 'h';
		quine[156] = ';';
		quine[157] = 'j';
		quine[158] = '+';
		quine[159] = '+';
		quine[160] = ')';
		quine[161] = '{';
		quine[162] = 'S';
		quine[163] = 'y';
		quine[164] = 's';
		quine[165] = 't';
		quine[166] = 'e';
		quine[167] = 'm';
		quine[168] = '.';
		quine[169] = 'o';
		quine[170] = 'u';
		quine[171] = 't';
		quine[172] = '.';
		quine[173] = 'p';
		quine[174] = 'r';
		quine[175] = 'i';
		quine[176] = 'n';
		quine[177] = 't';
		quine[178] = '(';
		quine[179] = 'S';
		quine[180] = 't';
		quine[181] = 'r';
		quine[182] = 'i';
		quine[183] = 'n';
		quine[184] = 'g';
		quine[185] = '.';
		quine[186] = 'f';
		quine[187] = 'o';
		quine[188] = 'r';
		quine[189] = 'm';
		quine[190] = 'a';
		quine[191] = 't';
		quine[192] = '(';
		quine[193] = '"';
		quine[194] = 'q';
		quine[195] = 'u';
		quine[196] = 'i';
		quine[197] = 'n';
		quine[198] = 'e';
		quine[199] = '[';
		quine[200] = '%';
		quine[201] = 'd';
		quine[202] = ']';
		quine[203] = '=';
		quine[204] = '\'';
		quine[205] = '%';
		quine[206] = 'c';
		quine[207] = '\'';
		quine[208] = ';';
		quine[209] = '"';
		quine[210] = ',';
		quine[211] = 'j';
		quine[212] = ',';
		quine[213] = 'q';
		quine[214] = 'u';
		quine[215] = 'i';
		quine[216] = 'n';
		quine[217] = 'e';
		quine[218] = '[';
		quine[219] = 'j';
		quine[220] = ']';
		quine[221] = ')';
		quine[222] = ')';
		quine[223] = ';';
		quine[224] = '}';
		quine[225] = '}';
		quine[226] = 'S';
		quine[227] = 'y';
		quine[228] = 's';
		quine[229] = 't';
		quine[230] = 'e';
		quine[231] = 'm';
		quine[232] = '.';
		quine[233] = 'o';
		quine[234] = 'u';
		quine[235] = 't';
		quine[236] = '.';
		quine[237] = 'p';
		quine[238] = 'r';
		quine[239] = 'i';
		quine[240] = 'n';
		quine[241] = 't';
		quine[242] = '(';
		quine[243] = 'q';
		quine[244] = 'u';
		quine[245] = 'i';
		quine[246] = 'n';
		quine[247] = 'e';
		quine[248] = '[';
		quine[249] = 'i';
		quine[250] = ']';
		quine[251] = ')';
		quine[252] = ';';
		quine[253] = '}';
		for (int i = 0; i < quine.length; i++) {
			if (i == 88) {
				for (int j = 0; j < quine.length; j++) {
					System.out.print(String.format("quine[%d]='%c';", j, quine[j]));
				}
			}
			System.out.print(quine[i]);
		}
	}
}