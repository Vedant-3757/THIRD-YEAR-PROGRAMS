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



'Q4
'Module program
'    Class vars
'        Public name As String = "Vedant"
'        Private marks As Integer = 40
'        Protected age As Integer = 21
'        Friend city As String = "Mumbai"
'        Public Sub display()
'            Console.WriteLine("Name: " & name)
'            Console.WriteLine("Marks: " & marks)
'            Console.WriteLine("Age: " & age)
'            Console.WriteLine("City: " & city)
'        End Sub
'    End Class
'    Class demo
'        Inherits vars
'        Public Sub show()
'            Console.WriteLine("Age: " & age)
'        End Sub
'    End Class
'    Sub main()
'        Dim v As New vars
'        v.display()
'        Dim d As New demo
'        d.show()
'    End Sub
'End Module


'Q5
'Module program
'    Sub main()
'        Try
'            Dim a As Integer = 10
'            Dim b As Integer = 10
'            Dim c As Integer = a / b
'            Console.WriteLine("Division: " & c)
'        Catch ex As Exception
'            Console.WriteLine("Error: Cant Divide by zero")
'        Finally
'            Console.WriteLine("Code executed without any kind of error!")
'        End Try
'    End Sub
'End Module


'SET B 
'Q1
'Module program
'    Class Student
'        Public Property rollno As Integer
'        Public Property name As String
'        Public Sub display(rollno, name)
'            Console.WriteLine("RNO: " & rollno)
'            Console.WriteLine("NAME: " & name)
'        End Sub
'    End Class
'    Sub main()
'        Dim s As New Student
'        s.display(1, "VEDANT")
'    End Sub
'End Module



'Q2
'Module program
'    Class person
'        Public Property name
'        Public Property age
'        Public Sub display(name, age)
'            Console.WriteLine("name: " & name)
'            Console.WriteLine("age: " & age)
'        End Sub
'    End Class
'    Class student
'        Inherits person
'        Public Sub display(name, age)
'            Console.WriteLine("name: " & name)
'            Console.WriteLine("age: " & age)
'        End Sub
'    End Class
'    Sub main()
'        Dim s As New student
'        s.display("Vedant", 21)
'    End Sub
'End Module



'Q3
'Module program
'    Class base
'        Public Sub display()
'            Console.WriteLine("Parent Class")
'        End Sub
'    End Class
'    Class child
'        Inherits base
'        Public Sub display()
'            MyBase.display()
'            Console.WriteLine("Student Class")
'            MyClass.childdisplay()
'        End Sub
'        Public Sub childdisplay()
'            Console.WriteLine("STudent INFO")
'        End Sub
'    End Class
'    Sub main()
'        Dim a As New child
'        a.display()
'    End Sub
'End Module





'Q4
'Module program
'    Class person
'        Public Overridable Sub display()
'            Console.WriteLine("Parent Method")
'        End Sub
'    End Class
'    Class student
'        Inherits person
'        Public Overrides Sub display()
'            Console.WriteLine("Student Method")
'        End Sub
'    End Class
'    Sub main()
'        Dim s As New student
'        s.display()
'    End Sub
'End Module


'Q5
'Module program
'    Interface IStudent
'        Sub DisplayDetails()
'    End Interface
'    Class students
'        Implements IStudent
'        Public Sub DisplayDetails() Implements IStudent.DisplayDetails
'            Console.WriteLine("Student Name: Vedant")
'            Console.WriteLine("Student Age: 21")
'            Console.WriteLine("Student Marks: 54")
'            Console.WriteLine("Student Class: TY BSC IT")
'        End Sub
'    End Class
'    Sub main()
'        Dim s As New students
'        s.DisplayDetails()
'    End Sub
'End Module


'SET C
'Q2
'Module program
'    Interface Ishape
'        Function displayarea() As Double
'    End Interface
'    Class circle
'        Implements Ishape
'        Dim r As Double = 5
'        Public Function displayarea() As Double Implements Ishape.displayarea
'            Return 3.14 * r * r
'        End Function
'    End Class
'    Class rectangle
'        Implements Ishape
'        Dim l As Double = 11.5
'        Dim b As Double = 10.2

'        Public Function displayarea() As Double Implements Ishape.displayarea
'            Return l * b
'        End Function
'    End Class
'    Sub main()
'        Dim i As Ishape
'        i = New circle
'        Console.WriteLine("Area of Circle: " & i.displayarea())
'        i = New rectangle
'        Console.WriteLine("Area of Rectangle: " & i.displayarea())
'    End Sub
'End Module


'Q3
Module program
    Class salaryException
        Inherits Exception
    End Class
    Sub main()
        Try
            Dim sal As Integer
            Console.WriteLine("Enter Salary: ")
            sal = Console.ReadLine()
            If sal < 0 Then
                Throw New salaryException()
            End If
        Catch ex As salaryException
            Console.WriteLine("Salary cannot be negative")
        Finally
            Console.WriteLine("Program Finished")
        End Try
    End Sub
End Module
