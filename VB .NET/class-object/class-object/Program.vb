'Module program
'    Class std
'        Public age As Integer
'        Public Sub show()
'            Console.WriteLine(age)
'        End Sub
'    End Class
'    Sub main()
'        Dim a As New std()
'        a.age = 52
'        a.show()
'    End Sub
'End Module







'Module program
'    Class std
'        Public age As Integer
'        Public Sub show()
'            Console.WriteLine(age)
'        End Sub
'    End Class
'    Class solo
'        Inherits std
'        Public name As String
'        Public Sub display()
'            Console.WriteLine(name)
'            Console.WriteLine(age)
'        End Sub
'    End Class
'    Sub main()
'        'Dim a As New std()
'        'a.age = 52
'        'a.show()
'        Dim s As New solo()
'        s.name = "VED"
'        s.age = 22
'        s.display()
'    End Sub
'End Module






Module program
    Class cmp
        Public cmpname As String
        Public Sub show()
            Console.WriteLine("<---Details--->")
            Console.WriteLine("Company name : " & cmpname)
        End Sub
    End Class
    Class emp
        Inherits cmp
        Public empname As String
        Public empage As Integer
        Public Sub display()
            Console.WriteLine("Company name : " & cmpname)
            Console.WriteLine("Employee name : " & empname)
            Console.WriteLine("Employee age : " & empage)
        End Sub
    End Class
    Sub main()
        Dim a As New emp()
        a.cmpname = "JP MORGANS CHASE & CO."
        a.empname = "Vedant Shinde"
        a.empage = 21
        a.display()
    End Sub
End Module