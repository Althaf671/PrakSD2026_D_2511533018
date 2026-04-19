package pekan3_2511533018;

import java.util.ArrayList;

public class SiswaStack_2511533018 
{
	private ArrayList<Siswa_2511533018> stack_3018;
	
	public SiswaStack_2511533018()
	{
		stack_3018 = new ArrayList<>();
	}
	
	public void push_2511533018(Siswa_2511533018 mhs)
	{
		stack_3018.add(mhs);
	}
	
	public Siswa_2511533018 pop_2511533018()
	{
		if (!isEmpty_2511533018()) 
		{
			return stack_3018.remove(stack_3018.size() - 1);
		}
		
		return null;
	}
	
	public Siswa_2511533018 peek_2511533018()
	{
		if (!isEmpty_2511533018())
		{
			return stack_3018.get(stack_3018.size() - 1);
		}
		
		return null;
	}
	
	public boolean isEmpty_2511533018()
	{
		return stack_3018.isEmpty();
	}
	
	public void tampilkanSiswa_2511533018()
	{
		for (int i = stack_3018.size() - 1; i >= 0; i--)
			System.out.println(stack_3018.get(i));
	}
	
	public static void main(String[] args)
	{
		SiswaStack_2511533018 s_3018 = new SiswaStack_2511533018();
		
		Siswa_2511533018 mhs1 = new Siswa_2511533018("Ali", 1);
		Siswa_2511533018 mhs2 = new Siswa_2511533018("Althaf", 2);
		Siswa_2511533018 mhs3 = new Siswa_2511533018("Kashley", 3);
		
		s_3018.push_2511533018(mhs1);
		s_3018.push_2511533018(mhs2);
		s_3018.push_2511533018(mhs3);
		
		System.out.println("Siswa di dalam stack:");
		s_3018.tampilkanSiswa_2511533018();
		
		System.out.println("Siswa teratas: " + s_3018.peek_2511533018());
		System.out.println("Mengeluarkan siswa teratas dari stack: " + s_3018.pop_2511533018());
		System.out.println("Daftar Siswa setelah di pop: ");
		s_3018.tampilkanSiswa_2511533018();
	}
}

