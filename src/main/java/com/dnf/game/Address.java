package com.dnf.game;

public class Address {
    public static final long RWCallAddr = 0x1447DF9E0L; // 人物CALL
    public static final long JSDjAddr = 0x14AEE6240L; // 角色等级
    public static final long PFAddr = 0x14AEFEE80L; // 评分基址
    public static final long BbJzAddr = 0x14AF00000L; // 背包基址
    public static final long JSPtrAddr = 0x14AEFFDD0L; // 角色指针
    public static final long YXZTAddr = 0x14AA8ED44L; // 游戏状态
    public static final long HBCallAddr = 0x13FDC0000L; // 汇编CALL
    public static final long JNCallAddr = 0x14435DCC0L; // 技能CALL
    public static final long TaskAddr = 0x14AF000E8L; // 任务基址
    public static final long JsCallAddr = 0x143C6F880L; // 接受CALL
    public static final long WcCallAddr = 0x143C6FD40L; // 完成CALL
    public static final long TjCallAddr = 0x143C6F970L; // 提交CALL
    public static final long DHAddr = 0x14B7FA4F8L; // 对话基址
    public static final long DHAddrB = 0x14AD48290L; // 对话基址B
    public static final long EscDHAddr = 0x14AD482B0L; // Esc对话基址
    public static final long SJAddr = 0x20A050L; // 时间基址
    public static final long FJBHAddr = 0x14AEFFFE8L; // 房间编号
    public static final long MaxPlAddr = 0x14B7AA79CL; // 最大疲劳
    public static final long CutPlAddr = 0x14B7AA80CL; // 当前疲劳
    public static final long QyParamAddr = 0x14B7FF608L; // 区域参数
    public static final long QyCallAddr = 0x145616D60L; // 区域CALL
    public static final long QyPyAddr = 0xA76E0L; // 区域偏移
    public static final long JTuCallAddr = 0x145691F80L; // 进图CALL
    public static final long GtCallAddr = 0x1437B27F0L; // 过图CALL
    public static final long PyCall1Addr = 0x143615DE0L; // 漂移CALL
    public static final long PyCall2Addr = 0x14578AD90L; // 漂移CALL2
    public static final long XrNcCallAddr = 0x14481AFE0L; // 写入内存
    public static final long CzSyRdxAddr = 0x14AED4378L; // 城镇瞬移_Rdx
    public static final long CzSyCallAddr = 0x14565A9D0L; // 城镇瞬移CALL
    public static final long DqFzAddr = 0x58L; // 当前负重
    public static final long ZdFzAddr = 0x2AC0L; // 最大负重
    public static final long FbAddr = 0x14B8000D0L; // 发包基址
    public static final long HcCallAddr = 0x1456BC1C0L; // 缓冲CALL
    public static final long FbCallAddr = 0x1456BCDA0L; // 发包CALL
    public static final long JmB1CallAddr = 0x1456BCEF0L; // 加密包CALL
    public static final long JmB2CallAddr = 0x1456BD230L; // 加密包CALL2
    public static final long JmB3CallAddr = 0x1456BCF10L; // 加密包CALL4
    public static final long JmB4CallAddr = 0x1456BCF30L; // 加密包CALL8
    public static final long SqNcCallAddr = 0x1435EC0A0L; // 申请内存
    public static final long TmCallAddr = 0x1456EB0E0L; // 透明CALL
    public static final long RwMwAddr = 0x118A4L; // 人物名望
    public static final long WpMcAddr = 0x40L; // 物品名称
    public static final long DtKs2 = 0x198L; // 地图开始2
    public static final long DtJs2 = 0x1A0L; // 地图结束2
    public static final long DtPyAddr = 0x158L; // 地图偏移
    public static final long LxPyAddr = 0x12CL; // 类型偏移
    public static final long FxPyAddr = 0x140L; // 方向偏移
    public static final long CEPfAddr = 0x88L; // 评分偏移
    public static final long FbSqAddr = 0x134L; // 发包拾取
    public static final long GwXlAddr = 0x4BD8L; // 怪物血量
    public static final long ZyPyAddr = 0xD40L; // 阵营偏移
    public static final long DmWpAddr = 0x27E0L; // 地面物品
    public static final long DmPyAddr = 0x7C0L; // 代码偏移
    public static final long McPyAddr = 0x7C8L; // 名称偏移
    public static final long ZbPjAddr = 0x2B8L; // 装备品级
    public static final long DqZbAddr = 0x320L; // 读取坐标
    public static final long YjRwStartAddr = 0x10L; // 已接任务首地址
    public static final long YjRwEndAddr = 0x18L; // 已接任务尾地址
    public static final long QbRwStartAddr = 0xA8L; // 全部任务首地址
    public static final long QbRwEndAddr = 0xB0L; // 全部任务尾地址
    public static final long RwLxAddr = 0x218L; // 任务类型
    public static final long RwDxAddr = 0x28L; // 任务大小
    public static final long RwTjAddr = 0x4B0L; // 任务条件
    public static final long RwFbAddr = 0x468L; // 任务副本
    public static final long SfKmAddr = 0x25CL; // 是否开门
    public static final long CutRoomXAddr = 0x1B60L; // 当前房间X
    public static final long CutRoomYAddr = 0x1B64L; // 当前房间Y
    public static final long BOSSRoomXAddr = 0x1C60L; // BOSS房间X
    public static final long BOSSRoomYAddr = 0x1C64L; // BOSS房间Y
    public static final long GouHuoAddr = 0x1CF0L; // 篝火判断
    public static final long SyPyAddr = 0x1C54L; // 索引偏移
    public static final long MxPyAddr = 0x128L; // 门型偏移
    public static final long KgPyAddr = 0x7D8L; // 宽高偏移
    public static final long SzPyAddr = 0x7F8L; // 数组偏移
    public static final long DtMcAddr = 0x360L; // 地图名称
    public static final long StPyAddr = 0xC0L; // 顺图偏移
    public static final long ZbStPyAddr = 0x3398L; // 坐标顺图
    public static final long FxIdAddr = 0xE0L; // 方向ID
    public static final long WplAddr = 0xF8E0L; // 物品栏
    public static final long WplPyAddr = 0xA8L; // 物品栏偏移
    public static long RwKbAddr = 0;  // 人物基址
    public static long NcBhKbAddr = 0;  // 内存汇编
    public static long JnKbAddr = 0;  // 技能Call
    public static long GtKbAddr = 0;  // 过图Call
}
