Module program
    Sub main()
        Console.WriteLine("Enter 5 Values : ")
        Dim a As Integer = Console.ReadLine()
        Dim b As Integer = Console.ReadLine()
        Dim c As Integer = Console.ReadLine()
        Dim d As Integer = Console.ReadLine()
        Dim e As Integer = Console.ReadLine()
        Try
            If a > 0 Then
                If a Mod 2 = 0 Then
                    Console.WriteLine(a & " is Square root of " & Math.Sqrt(a))
                Else
                    Console.WriteLine("First value is odd")
                End If
            Else
                Throw New Exception("The First number is negative")
            End If
            If b > 0 Then
                If b Mod 2 = 0 Then
                    Console.WriteLine(b & " is Square root of " & Math.Sqrt(b))
                Else
                    Console.WriteLine("Second value is odd")
                End If
            Else
                Throw New Exception("The Second number is negative")
            End If
            If c > 0 Then
                If c Mod 2 = 0 Then
                    Console.WriteLine(c & " is Square root of " & Math.Sqrt(c))
                Else
                    Console.WriteLine("Third value is odd")
                End If
            Else
                Throw New Exception("The Third number is negative")
            End If
            If d > 0 Then
                If d Mod 2 = 0 Then
                    Console.WriteLine(d & " is Square root of " & Math.Sqrt(d))
                Else
                    Console.WriteLine("Fourth value is odd")
                End If
            Else
                Throw New Exception("The Fourth number is negative")
            End If
            If e > 0 Then
                If e Mod 2 = 0 Then
                    Console.WriteLine(e & " if Square root of " & Math.Sqrt(e))
                Else
                    Console.WriteLine("Fifth value is odd")
                End If
            Else
                Throw New Exception("The Fifth number is negative")
            End If

        Catch ex As Exception
            Console.WriteLine(ex.Message)
        End Try
    End Sub
End Module