package github.pasiahopelto.wicket.experiments;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

import de.agilecoders.wicket.core.markup.html.bootstrap.block.Code;
import de.agilecoders.wicket.core.markup.html.bootstrap.block.CodeBehavior.Language;
import de.agilecoders.wicket.core.markup.html.bootstrap.components.TooltipBehavior;
import de.agilecoders.wicket.core.markup.html.bootstrap.heading.Heading;

public class BlockElementsHome extends WebPage {

	private static final long serialVersionUID = 1L;

	public BlockElementsHome() {
		add(new Heading("topHeading", "Block Elements"));
		add(new Heading("codeBlockHeading", "Code Block"));
		add(new Code("javaCode", Model.of("public class BlockElementsHome extends WebPage {\n	private static final long SerialVersionUID = 1L;\n}")).setShowLineNumbers(true).setLanguage(Language.JAVA));
		add(new Heading("tooltipHeading", "Tooltip"));
		addHoverOverTooltip();
	}

	private void addHoverOverTooltip() {
		Label label = new Label("hoverOver", "Hover over...");
		label.add(new TooltipBehavior(Model.of("Tooltip!")));
		add(label);
	}
	
}
