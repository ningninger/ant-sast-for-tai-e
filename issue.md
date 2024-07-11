关于sast-java中部分测试用例的sink函数

你好，我正在使用该测试样例中的`sast-java`部分来进行污点分析的测试，当我在测试`sast-java/src/main/java/com/sast/astbenchmark/cases/completeness/base/chain/astTaint/Statement_CastStatement_002_T`和`sast-java/src/main/java/com/sast/astbenchmark/cases/completeness/base/chain/astTaint/Expression_MethodInvocation_Argument_002_T`这两个测试样例的时候出现了错误

我希望通过填写一些`taint-specification`来增强我的污点分析工具，但是我注意到这两个样例的形式同其他测试样例不同（包括测试代码和引用的库）并且我并不确定这两个样例的sink点是什么，按照`README.md`中的内容，我猜测应该是`Runtime.getRuntime().exec`，但是我手动进行污点追踪时，没有发现和该sink点相关的代码，所以我希望能确定这两个样例的sink点，如果我的猜测没有问题，可以给我更多的信息来提示我的sink点的位置么。





Hello, I'm using the `sast-java` test cases for conducting taint analysis testing. I encountered issues while testing `completeness/base/chain/astTaint/Statement_CastStatement_002_T` and `completeness/base/chain/astTaint/Expression_MethodInvocation_Argument_002_T`.

I aim to enhance my taint analysis tool by filling in some `taint-specification`. However, I noticed these two test cases differ from others in terms of structure (including test code and referenced libraries). I'm unsure about the sink points in these two cases. According to the `README.md`, I suspect it might be `Runtime.getRuntime().exec`, but I couldn't find any code related to this sink point during manual taint tracking.

Could you please confirm the sink points for these two cases? If my suspicion is correct, could you provide more information on where to locate the sink points?



Thank you



