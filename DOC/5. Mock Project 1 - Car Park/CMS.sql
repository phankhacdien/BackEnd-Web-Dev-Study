USE master
GO

/* Object:  Database SMS */
IF DB_ID('CMS') IS NOT NULL
	DROP DATABASE  CMS
GO

CREATE DATABASE CMS
GO

USE [CMS]
GO

/* Object:  Table [dbo].[Member] */
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Member]
(
    [MemberID] [int] IDENTITY(1,1) NOT NULL,
    [FirstName] [varchar](50) NULL,
    [LastName] [varchar](50) NULL,
    [UserName] [varchar](50) NOT NULL,
    [Password] [varchar](50) NOT NULL,
    [Phone] [varchar](50) NULL,
    [Email] [varchar](50) NOT NULL,
    [Description] [varchar](255) NULL,
    [CreatedDate] [date] NOT NULL,
    [UpdateTime] [date] NOT NULL,
    CONSTRAINT [PK_Member_Member_ID] PRIMARY KEY CLUSTERED ([MemberID] ASC)
)
GO

/* Object:  Table [dbo].[Content] */
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Content]
(
    [ContentID] [int] IDENTITY(1,1) NOT NULL,
    [Title] [varchar](100) NOT NULL,
    [Brief] [varchar](255) NOT NULL,
    [ContentMain] [varchar](255) NOT NULL,
    [CreatedDate] [date] NOT NULL,
    [UpdateTime] [date] NOT NULL,
    [MemberID] [int] NOT NULL,
    CONSTRAINT [PK_Orders_Content_ID] PRIMARY KEY CLUSTERED ([ContentID] ASC),
    CONSTRAINT [FK_Member_ID] FOREIGN KEY ([MemberID]) REFERENCES [Member] ([MemberID])
    ON DELETE CASCADE
        ON UPDATE NO ACTION,
)
GO


SET IDENTITY_INSERT [dbo].[Member] ON 
INSERT INTO [dbo].[Member]
    ( [MemberID], [FirstName], [LastName], [UserName], [Password], [Phone], [Email], [Description], [CreatedDate], [UpdateTime])
VALUES
    (1, 'Tran', 'Khang', 'KhangTV3', 'ARandomPassword1!', '0944828472', 'vankhang226@gmail.com', 'This is description of this account!', '2019/12/12', '2020/05/04');

INSERT INTO [dbo].[Member]
    ( [MemberID], [FirstName], [LastName], [UserName], [Password], [Phone], [Email], [Description], [CreatedDate], [UpdateTime])
VALUES
    (2, 'Nguyen', 'Huyen', 'HuyenNT2', 'ARandomPassword2!', '0848292812', 'nguyenhuyen12@gmail.com', 'This is description of this account!', '2019/12/02', '2020/05/01');

SET IDENTITY_INSERT [dbo].[Member] OFF
GO

SET IDENTITY_INSERT [dbo].[Content] ON 
INSERT INTO [dbo].[Content]
    ( [ContentID], [Title], [Brief],[ContentMain], [CreatedDate], [UpdateTime], [MemberID])
VALUES
    (1, 'This is title 1', 'This is a brief 1', 'This is content of a post 1', '2020/12/02', '2021/12/02', 1);
INSERT INTO [dbo].[Content]
    ( [ContentID], [Title], [Brief],[ContentMain], [CreatedDate], [UpdateTime], [MemberID])
VALUES
    (2, 'This is title 2', 'This is a brief 2', 'This is content of a post 2', '2020/11/12', '2021/12/02', 1);
INSERT INTO [dbo].[Content]
    ( [ContentID], [Title], [Brief],[ContentMain], [CreatedDate], [UpdateTime], [MemberID])
VALUES
    (3, 'This is title 3', 'This is a brief 3', 'This is content of a post 3', '2020/04/02', '2021/05/12', 2);
SET IDENTITY_INSERT [dbo].[Content] OFF
GO

--
--
-- SELECT [Content].[ContentID], [Content].[Title],[Content].[Brief],[Content].[CreatedDate]
-- FROM [dbo].[Content]
-- INNER JOIN [dbo].[Member]
-- ON [Content].[MemberID] = [Member].[MemberID]
-- WHERE [Member].[MemberID] = 1;
--
--
-- UPDATE [dbo].[Member]
-- SET [Member].[FirstName] = '1',[Member].[FirstName] = ?, [Member].[Phone], [Member].[Description]
-- WHERE [Member].[MemberID] =?;