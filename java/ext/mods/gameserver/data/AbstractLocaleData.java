/*
* Copyleft © 2024-2026 L2Brproject
* * This file is part of L2Brproject derived from aCis409/RusaCis3.8
* * L2Brproject is free software: you can redistribute it and/or modify it
* under the terms of the GNU General Public License as published by the
* Free Software Foundation, either version 3 of the License.
* * L2Brproject is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* General Public License for more details.
* * You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
* Our main Developers, Dhousefe-L2JBR, Agazes33, Ban-L2jDev, Warman, SrEli.
* Our special thanks, Nattan Felipe, Diego Fonseca, Junin, ColdPlay, Denky, MecBew, Localhost, MundvayneHELLBOY, 
* SonecaL2, Eduardo.SilvaL2J, biLL, xpower, xTech, kakuzo, Tiagorosendo, Schuster, LucasStark, damedd
* as a contribution for the forum L2JBrasil.com
 */
package ext.mods.gameserver.data;


import java.nio.file.Path;
import java.nio.file.Files;
import java.util.Locale;

public abstract class AbstractLocaleData extends AbstractData
{
	public final static Path BASE_LOCALE_PATH;
	
	protected Path resolve(Locale locale, String file)
	{
		String l1 = locale.toString(); // e.g. pt_BR
		String l2 = locale.toLanguageTag(); // e.g. pt-BR
		String l3 = locale.getLanguage(); // e.g. pt
		String l4 = l1.toLowerCase();
		String l5 = l2.toLowerCase();
		String l6 = l1.replace('_','-');
		String l7 = l1.replace('-','_');
		String[] candidates = new String[] { l1, l2, l3, l4, l5, l6, l7 };
		for (String c : candidates)
		{
			Path p = BASE_LOCALE_PATH.resolve(c).resolve("html").resolve(file);
			if (Files.exists(p))
				return p;
		}
		return BASE_LOCALE_PATH.resolve(l1).resolve("html").resolve(file);
	}
	
	protected Path resolve(Locale locale, Path file)
	{
		String l1 = locale.toString();
		String l2 = locale.toLanguageTag();
		String l3 = locale.getLanguage();
		String l4 = l1.toLowerCase();
		String l5 = l2.toLowerCase();
		String l6 = l1.replace('_','-');
		String l7 = l1.replace('-','_');
		String[] candidates = new String[] { l1, l2, l3, l4, l5, l6, l7 };
		for (String c : candidates)
		{
			Path p = BASE_LOCALE_PATH.resolve(c).resolve("html").resolve(file);
			if (Files.exists(p))
				return p;
		}
		return BASE_LOCALE_PATH.resolve(l1).resolve("html").resolve(file);
	}
	
	public LocalizedString getLocalizedString(String key)
	{
		return new LocalizedString(key, this);
	}
	
	public abstract String get(Locale locale, String key);
	
	static
	{
		BASE_LOCALE_PATH = Path.of(System.getProperty("ext.mods.gameserver.data.AbstractLocaleData.BASE_LOCALE_PATH", "data/locale"));
	}
}