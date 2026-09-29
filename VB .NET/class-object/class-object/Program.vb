Module program
    Public Class std
        Public name As String = Console.ReadLine()

        Public age As Integer = Console.ReadLine()
        Public Sub display()
            Console.WriteLine(name)
            Console.WriteLine(age)
        End Sub
    End Class
    Class dept
        Inherits std
        Public dept As String = Console.ReadLine()
        Public Sub show()
            Console.WriteLine("Name od Student : " & name)
            Console.WriteLine("Age of Student : " & age)
            Console.WriteLine("Department of Student : " & dept)
        End Sub
    End Class
    Sub main()
        'Dim a As New std()
        'a.display()
        Dim a As New dept()
        a.show()
    End Sub
End Module