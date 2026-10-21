'SET A
'Q1
'Public Class employee
'    Public id As Integer
'    Public name As String
'    Public salary As Integer
'    Public Sub display()
'        Console.WriteLine(
'            "EMP ID : " & id & Environment.NewLine &
'            "EMP NAME : " & name & Environment.NewLine &
'            "EMP SALARY : " & salary
'                            )
'    End Sub
'End Class
'Module program
'    Sub main()
'        Dim e As New employee
'        e.id = 1
'        e.name = "Vedant"
'        e.salary = 500
'        e.display()
'    End Sub
'End Module




'Q2

'Module program
'    Public Class book
'        Dim name As String
'        Dim author As String
'        Dim price As Integer
'        Public Sub New()
'            name = "wings of fire"
'            author = "Vedant"
'            price = 500
'        End Sub

'        Public Sub New(bname As String, bauthor As String, bprice As Integer)
'            name = bname
'            author = bauthor
'            price = bprice
'        End Sub
'        Public Sub display()
'            Console.WriteLine("NAME: " & name & Environment.NewLine &
'                "AUTHOR: " & author & Environment.NewLine &
'                "PRICE: " & price)
'        End Sub
'    End Class
'    Sub main()
'        Dim b As New book
'        b.display()
'        Dim bo As New book("NARCISST", "Vedant", 500)
'        bo.display()
'    End Sub
'End Module


'Q3
'Module Program
'    Class overloading
'        Dim name As String
'        Dim age As Integer
'        Dim degree As String
'        Public Sub display(name, age)
'            Console.WriteLine("NAME: " & name & Environment.NewLine & "AGE: " & age)
'        End Sub
'        Public Sub display(name, age, degree)
'            Console.WriteLine("NAME: " & name & Environment.NewLine & "AGE: " & age & "DEGREE: " & degree)
'        End Sub
'    End Class
'    Sub main()
'        Dim a As New overloading()
'        a.display("VEDANT", 21)
'        Dim b As New overloading()
'        b.display("KUNAL", 21, "BSC IT")
'    End Sub
'End Module




