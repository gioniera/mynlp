#NLPCLI
提供一个客户端命令行工具，完成以下几个功能：

## 分词工具

* segment 对命令行输入进行分词 参数选项可以控制分词模式
* 指定原始文件abc.txt 输出分词结果到 abcout.txt 分词用空格隔开

##1、处理CRF语料
    1. 处理2014版的语料，去除词性信息，产生BMSE标签标注数据
    2. 直接处理原始文本，产生BMSE标签的数据
    
##2、新词发现工具
    2.1 基于左右互信息和邻接熵的词组和新词工具
    2.2 使用CRF分词器对文本数据进行处理，产生新词词典

