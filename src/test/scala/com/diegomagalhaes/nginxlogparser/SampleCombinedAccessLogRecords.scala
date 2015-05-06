package com.diegomagalhaes.nginxlogparser

object SampleCombinedAccessLogRecords {

  val data = """
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9388&campaignid=680&zoneid=1618&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=0f7f34463a HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 2.2; pt-br; GT-I5500B Build/FROYO) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9389&campaignid=680&zoneid=1619&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=e84e481818 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 2.2; pt-br; GT-I5500B Build/FROYO) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9432&campaignid=681&zoneid=1637&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=5455b229b0 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 2.2; pt-br; GT-I5500B Build/FROYO) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1638, HTTP/1.1" 0.000  426 "-" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-P655H Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9348&campaignid=676&zoneid=1554&loc=1&cb=da3d687dcc HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9310&campaignid=655&zoneid=1630&loc=1&cb=cb81d8936c HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 2.3.6; pt-br; GT-S5830B Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1638, HTTP/1.1" 0.000  426 "-" Agent["Mozilla/5.0 (Linux; U; Android 2.3.4; pt-br; GT-S5830B Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[554796775440] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9432&campaignid=681&zoneid=1637&loc=1&cb=fe8e6f00b0 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (LG-T375 AppleWebkit/531 Browser/Phantom/V2.0 Widget/LGMW/3.0 MMS/LG-MMS-V1.0/1.2 Java/ASVM/1.1 Profile/MIDP-2.1 Configuration/CLDC-1.1)"] - . msisdn[558799165617] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9349&campaignid=676&zoneid=1555&loc=1&cb=91e0c8a58b HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9382&campaignid=679&zoneid=1519&cb=40f1441eb8 HTTP/1.1" 0.000  43 "-" Agent["MOT-EX128 Obigo/WAP2.0 MIDP-2.0/CLDC-1.1"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1638, HTTP/1.1" 0.000  35 "-" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[554999214323] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9365&campaignid=676&zoneid=1574&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=ecb8a5cce4 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 2.2; pt-br; GT-I5500B Build/FROYO) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9397&campaignid=679&zoneid=1587&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=e73cfa674b HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5303B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9088&campaignid=665&zoneid=1638&cb=62b3309c69 HTTP/1.1" 0.000  43 "-" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-P655H Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9088&campaignid=665&zoneid=1638&cb=62b3309c69 HTTP/1.1" 0.000  43 "-" Agent["Mozilla/5.0 (Linux; U; Android 2.3.4; pt-br; GT-S5830B Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[554796775440] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1566,1567,1568,1632,1633,1634,1575,1576,1577,1614,1615,1616,1605,1606,1607,1584,1585,1586,1611,1612,1613,1629,1630,1631,1554,1555,1556,1565,1636, HTTP/1.1" 0.000  6901 "-" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[554999214323] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9410&campaignid=680&zoneid=1616&loc=1&cb=210248b769 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.4.2; pt-br; LG-D105 Build/KOT49I) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.1599.103 Mobile Safari/537.36"] - . msisdn[558198962216] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9408&campaignid=680&zoneid=1614&loc=1&cb=5653cb6e66 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E450f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[5598981556509] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9348&campaignid=676&zoneid=1554&loc=1&cb=da3d687dcc HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; Android 4.2.2; pt-br; SAMSUNG GT-I9192 Build/JDQ39) AppleWebKit/535.19 (KHTML, like Gecko) Version/1.0 Chrome/18.0.1025.308 Mobile Safari/535.19"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9395&campaignid=681&zoneid=1632&loc=1&cb=a7a3db6c84 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5301B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9398&campaignid=679&zoneid=1588&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=b6eb86d313 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5303B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9398&campaignid=679&zoneid=1588&loc=1&cb=43ba4ecbdf HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (LG-T375 AppleWebkit/531 Browser/Phantom/V2.0 Widget/LGMW/3.0 MMS/LG-MMS-V1.0/1.2 Java/ASVM/1.1 Profile/MIDP-2.1 Configuration/CLDC-1.1)"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9301&campaignid=651&zoneid=1565&loc=1&cb=9d6665a5a5 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 2.3.6; pt-br; GT-I9070 Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9310&campaignid=655&zoneid=1630&loc=1&cb=cb81d8936c HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5303B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[557791710644] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9400&campaignid=679&zoneid=1589&loc=1&cb=827a5522a8 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (LG-T375 AppleWebkit/531 Browser/Phantom/V2.0 Widget/LGMW/3.0 MMS/LG-MMS-V1.0/1.2 Java/ASVM/1.1 Profile/MIDP-2.1 Configuration/CLDC-1.1)"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9387&campaignid=680&zoneid=1617&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=f639c3e7a0 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 2.2; pt-br; GT-I5500B Build/FROYO) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9351&campaignid=676&zoneid=1559&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=b7499cdb44 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; es-sa; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9400&campaignid=679&zoneid=1589&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=3f1b7c0af8 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5303B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1638, HTTP/1.1" 0.000  35 "-" Agent["Nokia501/2.0 (11.1.1) Profile/MIDP-2.1 Configuration/CLDC-1.1"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9375&campaignid=486&zoneid=1566&loc=1&cb=5e5da400bd HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9394&campaignid=681&zoneid=1567&loc=1&cb=a07b4507f0 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1562,1563,1564,1635,1572,1573,1574,1602,1603,1604,1617,1618,1619,1608,1609,1610,1557,1558,1559,1581,1582,1583,1587,1588,1589,1623,1624,1625,1637, HTTP/1.1" 0.000  7738 "-" Agent["Nokia501/2.0 (11.1.1) Profile/MIDP-2.1 Configuration/CLDC-1.1"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9362&campaignid=676&zoneid=1568&loc=1&cb=5197ed70d1 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9395&campaignid=681&zoneid=1632&loc=1&cb=a7a3db6c84 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9424&campaignid=679&zoneid=1634&loc=1&cb=ef5e839472 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9097&campaignid=667&zoneid=1633&loc=1&cb=a94ce556de HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9409&campaignid=680&zoneid=1615&loc=1&cb=bcd3d19576 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9408&campaignid=680&zoneid=1614&loc=1&cb=5653cb6e66 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9309&campaignid=653&zoneid=1606&loc=1&cb=787d3ec6e6 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9411&campaignid=680&zoneid=1605&loc=1&cb=af2f61e366 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=8931&campaignid=650&zoneid=1607&loc=1&cb=d7e2642616 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9410&campaignid=680&zoneid=1616&loc=1&cb=210248b769 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9375&campaignid=486&zoneid=1566&loc=1&cb=5e5da400bd HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[553175331986] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9394&campaignid=681&zoneid=1567&loc=1&cb=a07b4507f0 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-P716 Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9362&campaignid=676&zoneid=1568&loc=1&cb=5197ed70d1 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-P716 Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9404&campaignid=681&zoneid=1562&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=97a4412324 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5301B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9394&campaignid=681&zoneid=1567&loc=1&cb=a07b4507f0 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 2.3.6; pt-br; GT-S5300B Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[5511959487063] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1566,1567,1568,1632,1633,1634,1575,1576,1577,1614,1615,1616,1605,1606,1607,1584,1585,1586,1611,1612,1613,1629,1630,1631,1554,1555,1556,1565,1636, HTTP/1.1" 0.000  6799 "http://wap.tim.com.br/lp/sbappsclub" Agent["Mozilla/5.0 (Linux; Android 4.4.2; SM-G800H Build/KOT49H) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.111 Mobile Safari/537.36"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9097&campaignid=667&zoneid=1633&loc=1&cb=9eadf1976b HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9424&campaignid=679&zoneid=1634&loc=1&cb=75fe3e33d8 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9395&campaignid=681&zoneid=1632&loc=1&cb=f4816cbee4 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9308&campaignid=657&zoneid=1567&loc=1&cb=5fb5f690d5 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9362&campaignid=676&zoneid=1568&loc=1&cb=b153b7a1ff HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9375&campaignid=486&zoneid=1566&loc=1&cb=5e806d6b37 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9408&campaignid=680&zoneid=1614&loc=1&cb=d4a90f82f7 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9409&campaignid=680&zoneid=1615&loc=1&cb=dfeb42adee HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9410&campaignid=680&zoneid=1616&loc=1&cb=a2f69f4e52 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9327&campaignid=677&zoneid=1575&loc=1&cb=349542de5e HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9329&campaignid=677&zoneid=1577&loc=1&cb=9dd4e86547 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9328&campaignid=677&zoneid=1576&loc=1&cb=a4093df8a1 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9394&campaignid=681&zoneid=1567&loc=1&cb=a07b4507f0 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[553175331986] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9362&campaignid=676&zoneid=1568&loc=1&cb=5197ed70d1 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[553175331986] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9309&campaignid=653&zoneid=1606&loc=1&cb=787d3ec6e6 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9372&campaignid=676&zoneid=1635&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=3c714bf063 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5301B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9137&campaignid=656&zoneid=1623&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=9a585b2e5f HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5303B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1566,1567,1568,1632,1633,1634,1575,1576,1577,1614,1615,1616,1605,1606,1607,1584,1585,1586,1611,1612,1613,1629,1630,1631,1554,1555,1556,1565,1636, HTTP/1.1" 0.000  6799 "http://wap.tim.com.br/lp/sbappsclub" Agent["Mozilla/5.0 (Linux; U; Android 2.3.6; pt-br; GT-I9070 Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[554797755734] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9349&campaignid=676&zoneid=1555&loc=1&cb=91e0c8a58b HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; Android 4.2.2; pt-br; SAMSUNG GT-I9192 Build/JDQ39) AppleWebKit/535.19 (KHTML, like Gecko) Version/1.0 Chrome/18.0.1025.308 Mobile Safari/535.19"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9151&campaignid=664&zoneid=1556&loc=1&cb=73c73e9a0d HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 2.3.6; pt-br; GT-S5360B Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9349&campaignid=676&zoneid=1555&loc=1&cb=91e0c8a58b HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 2.3.6; pt-br; GT-S5360B Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9301&campaignid=651&zoneid=1565&loc=1&cb=9d6665a5a5 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 2.3.6; pt-br; GT-S5360B Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9301&campaignid=651&zoneid=1565&loc=1&cb=9d6665a5a5 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 2.3.6; pt-br; LG-E405f Build/GRK39F) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1 MMS/LG-Android-MMS-V1.2"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9151&campaignid=664&zoneid=1556&loc=1&cb=73c73e9a0d HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9375&campaignid=486&zoneid=1566&loc=1&cb=5e5da400bd HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 2.3.6; pt-br; GT-S5360B Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9374&campaignid=676&zoneid=1602&loc=1&cb=9dba986675 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["SAMSUNG-GT-B7320/1.0 Profile/MIDP-2.1 Configuration/CLDC-1.1 Mozilla/4.0 (compatible; MSIE 6.0; Windows CE; IEMobile 8.12; MSIEMobile 6.0)"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9395&campaignid=681&zoneid=1632&loc=1&cb=a7a3db6c84 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[553175331986] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9097&campaignid=667&zoneid=1633&loc=1&cb=a94ce556de HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[553175331986] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1638, HTTP/1.1" 0.000  426 "-" Agent["Mozilla/5.0 (Linux; U; Android 4.4.2; pt-br; LG-D724 Build/KOT49I) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.1599.103 Mobile Safari/537.36"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1638, HTTP/1.1" 0.000  426 "-" Agent["Mozilla/5.0 (Linux; U; Android 4.2.2; pt-br; ONE TOUCH 4033E Build/JDQ39) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.2 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9301&campaignid=651&zoneid=1565&loc=1&cb=9d6665a5a5 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9088&campaignid=665&zoneid=1638&cb=62b3309c69 HTTP/1.1" 0.000  43 "-" Agent["Mozilla/5.0 (Linux; U; Android 4.4.2; pt-br; LG-D724 Build/KOT49I) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.1599.103 Mobile Safari/537.36"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1566,1567,1568,1632,1633,1634,1575,1576,1577,1614,1615,1616,1605,1606,1607,1584,1585,1586,1611,1612,1613,1629,1630,1631,1554,1555,1556,1565,1636, HTTP/1.1" 0.000  6799 "-" Agent["Mozilla/5.0 (Linux; U; Android 4.2.2; pt-br; ONE TOUCH 4033E Build/JDQ39) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.2 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9424&campaignid=679&zoneid=1634&loc=1&cb=ef5e839472 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-E467f Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[553175331986] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1562,1563,1564,1635,1572,1573,1574,1602,1603,1604,1617,1618,1619,1608,1609,1610,1557,1558,1559,1581,1582,1583,1587,1588,1589,1623,1624,1625,1637, HTTP/1.1" 0.000  7783 "http://wap.tim.com.br/lp/sbappsclub" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5301B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9144&campaignid=664&zoneid=1606&loc=1&cb=de053146a2 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9430&campaignid=681&zoneid=1636&loc=1&cb=9e982b90fa HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9412&campaignid=679&zoneid=1584&loc=1&cb=96092caf07 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9411&campaignid=680&zoneid=1605&loc=1&cb=ad6d5e80a0 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=8857&campaignid=648&zoneid=1611&loc=1&cb=e12377a566 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9418&campaignid=679&zoneid=1612&loc=1&cb=5421640ba8 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9430&campaignid=681&zoneid=1636&loc=1&cb=5b8dc42e09 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/new_spc.php?zones=1566,1567,1568,1632,1633,1634,1575,1576,1577,1614,1615,1616,1605,1606,1607,1584,1585,1586,1611,1612,1613,1629,1630,1631,1554,1555,1556,1565,1636, HTTP/1.1" 0.000  6799 "http://wap.tim.com.br/lp/sbappsclub" Agent["Mozilla/5.0 (Linux; U; Android 4.1.2; pt-br; LG-D685 Build/JZO54K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9414&campaignid=679&zoneid=1585&loc=1&cb=ce53340f54 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9416&campaignid=679&zoneid=1586&loc=1&cb=49fad98995 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.0.3; pt-br; GT-P3100 Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=8931&campaignid=650&zoneid=1607&loc=1&cb=0545156667 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9395&campaignid=681&zoneid=1632&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=fb0c17dda1 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 2.3.6; pt-br; GT-S5300B Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9365&campaignid=676&zoneid=1574&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=ecb8a5cce4 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5301B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9311&campaignid=653&zoneid=1625&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=92475f8357 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5303B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9375&campaignid=486&zoneid=1566&loc=1&cb=5e5da400bd HTTP/1.1" 0.000  43 "http://wap.tim.com.br/" Agent["Mozilla/5.0 (Linux; U; Android 4.4.2; pt-br; LG-D685 Build/KOT49I) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.1599.103 Mobile Safari/537.36"] - . msisdn[-] xcall[-] 200
   192.168.0.237 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9387&campaignid=680&zoneid=1617&loc=1&referer=http%3A%2F%2Fwap.tim.com.br%2Flp%2Fsbappsclub&cb=f639c3e7a0 HTTP/1.1" 0.000  43 "http://wap.tim.com.br/home" Agent["Mozilla/5.0 (Linux; U; Android 4.0.4; pt-br; GT-S5301B Build/IMM76D) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30"] - . msisdn[-] xcall[-] 200
   192.168.0.102 - - [04/May/2015:23:02:01 -0300]  "GET /adserver/www/delivery/lg.php?bannerid=9412&campaignid=679&zoneid=1584&loc=1&cb=5b3940d629 HTTP/1.1" 0.000  43 "http://m.tim.com.br/" Agent["Opera/9.80 (J2ME/MIDP; Opera Mini/4.5.35748/36.1867; U; pt) Presto/2.12.423 Version/12.16"] - . msisdn[-] xcall[-] 200
   """.split("\n").filter(_ != "")

  val badRecord = """
66.249.70.10 - - [23/Feb/2014:03:21:59 -0700] "GET /blog/post/java/how-load-multiple-spring-context-files-standalone/ HTTP/1.0" 301 - "-" "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)"
""".split("\n").filter(_ != "")


}

