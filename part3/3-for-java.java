{\rtf1\ansi\ansicpg949\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;\f1\fnil\fcharset129 AppleSDGothicNeo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue255;\red255\green255\blue254;\red0\green0\blue0;
\red19\green120\blue72;\red154\green154\blue154;\red144\green1\blue18;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c100000;\cssrgb\c100000\c100000\c99608;\cssrgb\c0\c0\c0;
\cssrgb\c3529\c53333\c35294;\cssrgb\c66667\c66667\c66667;\cssrgb\c63922\c8235\c8235;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl420\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import\cf4 \strokec4  java.util.*;\cb1 \
\
\cf2 \cb3 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 class\cf4 \strokec4  Main \{\cb1 \
\
\pard\pardeftab720\sl420\partightenfactor0
\cf4 \cb3     \cf2 \strokec2 public\cf4 \strokec4  \cf2 \strokec2 static\cf4 \strokec4  \cf2 \strokec2 void\cf4 \strokec4  main(String[] args) \{\cb1 \
\cb3         \cf2 \strokec2 int\cf4 \strokec4  m = \cf5 \strokec5 3\cf4 \strokec4 ;\cb1 \
\cb3         \cf2 \strokec2 int\cf4 \strokec4  n = \cf5 \strokec5 3\cf4 \strokec4 ;\cb1 \
\
\cb3         \cf2 \strokec2 int\cf4 \strokec4  array[][] = \{ \{\cf5 \strokec5 3\cf4 \strokec4 ,\cf5 \strokec5 1\cf4 \strokec4 ,\cf5 \strokec5 2\cf4 \strokec4 \}\cb1 \
\cb3                     ,\{\cf5 \strokec5 4\cf4 \strokec4 ,\cf5 \strokec5 1\cf4 \strokec4 ,\cf5 \strokec5 4\cf4 \strokec4 \}\cb1 \
\cb3                     ,\{\cf5 \strokec5 2\cf4 \strokec4 ,\cf5 \strokec5 2\cf4 \strokec4 ,\cf5 \strokec5 2\cf4 \strokec4 \}    \cb1 \
\cb3         \};\cb1 \
\
\cb3         \cf2 \strokec2 int\cf4 \strokec4  max = \cf5 \strokec5 0\cf4 \strokec4 ;\cb1 \
\
\cb3         \cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4  i=\cf5 \strokec5 0\cf4 \strokec4 ; i<array.length; i++) \{\cb1 \
\cb3           \cf2 \strokec2 int\cf4 \strokec4  tempMin = \cf5 \strokec5 9999\cf4 \strokec4 ;\cb1 \
\cb3           \cf6 \strokec6 // 
\f1 \'b0\'a2
\f0  
\f1 \'c7\'e0\'bf\'a1\'bc\'ad
\f0  
\f1 \'b0\'a1\'c0\'e5
\f0  
\f1 \'c0\'db\'c0\'ba
\f0  
\f1 \'bc\'f6
\f0  
\f1 \'c8\'ae\'c0\'ce
\f0 \cf4 \cb1 \strokec4 \
\cb3           \cf2 \strokec2 for\cf4 \strokec4 (\cf2 \strokec2 int\cf4 \strokec4  j=\cf5 \strokec5 0\cf4 \strokec4 ; j<array[i].length; j++) \{\cb1 \
\cb3             \cf2 \strokec2 if\cf4 \strokec4 (array[i][j] <= tempMin) \{\cb1 \
\cb3               tempMin = array[i][j];\cb1 \
\cb3             \}\cb1 \
\cb3           \}\cb1 \
\cb3           System.out.println(\cf7 \strokec7 "tempMin="\cf4 \strokec4  + tempMin);\cb1 \
\cb3           \cf6 \strokec6 // 
\f1 \'b4\'d9\'b8\'a5
\f0  
\f1 \'c7\'e0\'c0\'c7
\f0  
\f1 \'c5\'ab
\f0  
\f1 \'b0\'aa\'b0\'fa
\f0  
\f1 \'ba\'f1\'b1\'b3
\f0 \cf4 \cb1 \strokec4 \
\cb3           \cf2 \strokec2 if\cf4 \strokec4 (tempMin>=max) \{\cb1 \
\cb3             max = tempMin;\cb1 \
\cb3           \}\cb1 \
\cb3         \}\cb1 \
\cb3         System.out.println(max);\cb1 \
\cb3     \}\cb1 \
\
\cb3 \}\cb1 \
}