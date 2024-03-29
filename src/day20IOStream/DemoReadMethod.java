package day20IOStream;
/*read每次都一个字节，为什么用int 来接收*/
public class DemoReadMethod {
	/*
	 * read()方法读取的是一个字节,为什么返回是int,而不是byte
	 * 
	 * 因为字节输入流可以操作任意类型的文件,比如图片音频等,
	 * 这些文件底层都是以二进制形式的存储的,如果每次读取都返回byte,
	 * 有可能在读到中间的时候遇到111111111
	 * 那么这11111111是byte类型的-1,
	 * 我们的程序是遇到-1就会停止不读了,
	 * 后面的数据就读不到了,所以在读取的时候用int类型接收,
	 * 如果11111111会在其前面补上
	 * 24个0凑足4个字节，
	 * 那么byte类型的-1就变成int类型的255了这样可以保证整个数据读完,
	 * 而结束标记的-1就是int类型
	 */
}
