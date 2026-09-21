Module program
    Sub main()
        Dim a As Integer = 5
        Dim b As Integer = 15
        If b Mod a = 0 Then
            Console.WriteLine($"{b} is Divisible by {a}")
        Else
            Console.WriteLine($"{b} isn't Divisible by {a}")
        End If

    End Sub
End Module