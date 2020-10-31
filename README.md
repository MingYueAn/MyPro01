# MyPro01

## 介绍

音乐播放器

## 软件架构
```
base（基本）
	Test.java（测试类，主类）
controller（控制）
	Data.java（数据）
handle（处理）
	HandleLogin.java（登录处理者）
	HandleRegister.java（注册处理者）
model（模型）
	Login.java（登录模型）
	Register.java（注册模型）
tool（工具）
	getConnection.java（加载JDBC_MySQL数据库驱动+连接数据库）
	stringUtil.java（字符串工具类）
view（视图）
	BackgroundPanel.java（有背景图片的Panel类）
	Interface_Login.java（登录界面）
	Interface_MainFrame.java（主界面）
	Interface_Register.java（注册界面）
	Panel_MusicBook.java（音乐书面板）
	Panel_MusicIsland.java（音乐岛面板）
	Panel_MusicTree.java（音乐树面板）
	Panel_PersonalInformation.java（个人信息）
	Panel_Playlists.java（播放列表）
	Panel_Seting.java（设置）
```
## 安装教程

1.  xxxx
2.  xxxx
3.  xxxx

## 使用说明

1.  xxxx
2.  xxxx
3.  xxxx

## 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request

## 特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5. Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6. Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)

# 简介

## MVC设计

### model模型：

- 存储数据的对象


### view视图：

- 为模型提供数据显示的对象
- 显示数据（读取数据库记录）

### controller控制器：

- 处理用户的交互操作，对用户操作做出响应
- 让模型和视图进行必要的交互
- 通过视图修改，获取模型中的数据；当模型中数据变化，视图更新显示
- 处理输入（写入数据库记录）

## 设计思路

### 数据库设计

- 创建数据库mypro01
- 创建用户表users
- 创建注册表register

### 数据模型

- 注册模型
- 登录模型
- 包名model

### 数据处理者

- 注册处理者
- 登录处理者
- 包名handle

### 视图

# 其他
```
User 
	UserID;// 用户账号
	UserPassword;// 用户密码
	UserName;// 用户名
	UserSentence;//个性签名
	UserGrade;//用户等级
	UserTime;//用户听歌总时长
Music
	MusicID;// 歌曲ID
	MusicName;// 歌名
	MusicTime;//某歌被听总时长
Contact
	UserID;// 用户账号
	MusicID;// 歌曲ID
	UserMusicTime;//某歌某人听歌时长
```
